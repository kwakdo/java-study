package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class ChatClientThread extends Thread {
	
	private Socket socket;

	public ChatClientThread(Socket socket, BufferedReader bufferedReader) {
		
	}

	@Override
	public void run() {
		InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
		String remoteHostAddress = inetSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetSocketAddress.getPort();
		ChatServer.log("connected by client[" + remoteHostAddress + ":" + remoteHostPort + "]");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			while(true) {
				String data = br.readLine();
				if(data == null) {
					ChatServer.log("closed by client");
					break;
				}
				
				ChatServer.log("received:" + data);
				pw.println(data);
			}
		} catch(SocketException ex) {
			System.out.println("[server] suddenly closed by client");
		} catch(IOException ex) {
			System.out.println("[server] error:" + ex);
		} finally {
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}