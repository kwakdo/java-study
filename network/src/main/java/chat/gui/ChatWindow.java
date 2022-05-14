package chat.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	private static BufferedReader br;
	private static PrintWriter pw;
	private Socket socket;

	public ChatWindow(String name, Socket socket, BufferedReader br, PrintWriter pw) {
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
		ChatWindow.br = br;
		ChatWindow.pw = pw;
		this.socket = socket;
	}

	public void show() {
		/**
		 * 1. UI 초기화
		 */
		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				finish();
			}
		});
		frame.setVisible(true);
		frame.pack();

		/**
		 * 2. IOStream (Pipeline established)
		 */
		/**
		 * 3. Chat Client Thread 생성하고 실행
		 */
		new ChatClientThread().start();
	}

	private void sendMessage() {
		String message = textField.getText();
		if ("quit".equals(message)) {

			pw.println("quit");
			pw.flush();
			finish();

		} else {
			if ("".equals(message)) {
				message = "";
			}
			pw.println("message:" + message);
		}
		textField.setText("");
		updateTextArea(frame + message);
	}

	private void updateTextArea(String message) {
		textArea.append(message);
		textArea.append("\n");
	}

	private void finish() {
		pw.println("quit");
		System.exit(0);
	}

	private class ChatClientThread extends Thread {
		@Override
		public void run() {

			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

				while (true) {
					String receive = br.readLine();
					updateTextArea(receive);
				}

			} catch (SocketException ex) {
				System.out.println("Chatting Ended.");

			} catch (IOException e) {
				System.out.println("error: " + e);
			}
		}
	}
}
