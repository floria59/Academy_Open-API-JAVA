package sec09.exam01_tcpip_multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultichatClient {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용법: java TcpIpMultichatClient 대화명");
			System.exit(0);
		}
		
		try {
			String serverIp = "127.0.0.1"; // 채팅서버의 IP   192.168.0.226
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
			
			
		}catch(ConnectException ex) {
			ex.printStackTrace();
		}catch(Exception ex) {
			
		}

	}
	
	// 1)채팅서버로 채팅내용을 보내는 기능(출력스트림)
	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;
		
		//클라이언트가 접속시 사용한 소켓객체대입, 대화명
		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream()); //출력스트림객체생성.
				this.name = name;
			}catch(Exception ex) {}
		}
		
		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in); // 콘솔환경하에서 사용자 입력데이터를 읽는 기능.
			try {
				if(out!= null) {
					out.writeUTF(name); // 채팅서버로 보내진다.
				}
				
				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			}catch(Exception ex) {}
		}
	} // ClientSender
	
	//2)채팅서버로부터 보내온 채팅내용을 읽는 기능(입력스트림)
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			}catch(IOException ex) {}
		}
		
		@Override
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				}catch(IOException e) {}
			}
		}
	}

}
