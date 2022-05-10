package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ChatClientThread extends Thread {

	private Socket socket;
	private BufferedReader bufferedReader;

	public ChatClientThread(Socket socket, BufferedReader bufferedReader) {
		this.socket = socket;
		this.bufferedReader = bufferedReader;

	}

	@Override
	public void run() {

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while (true) {
				String receive = bufferedReader.readLine();
				System.out.println(receive);
			}

		} catch (SocketException ex) {
			System.out.println("Chatting Ended.");
			
		} catch (IOException e) {
			System.out.println("error: " + e);
		}
	}
}