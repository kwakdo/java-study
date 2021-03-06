package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import chat.ChatServer;

public class ChatClientApp {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 9090;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		ChatServer.main(args);

		while(true) {
			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();
			
			if (name.isEmpty() == false ) {
				break;
			}
			
			System.out.println("대화명은 한 글자 이상 입력해야 합니다.\n");
		}
		
	scanner.close();
		
		try {

		socket = new Socket();
		
		socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
		log("Connected.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
		
		pw.println("join:" + name);
		pw.flush();

		String line = br.readLine();
		String[] tokens = line.split(":");
		if ("join".equals(tokens[0])) {
			new ChatWindow(name, socket, br, pw).show();
		} else {
			return;
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

}
	public static void log(String log) {
		System.out.println("[client] " + log);
	}
}
