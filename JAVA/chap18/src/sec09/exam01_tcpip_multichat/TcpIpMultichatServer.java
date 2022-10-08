package sec09.exam01_tcpip_multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultichatServer {

	HashMap<String, Object> clients; // 채팅서버의 접속자정보를 저장.
	
	public TcpIpMultichatServer() {
		clients = new HashMap<String, Object>();
		Collections.synchronizedMap(clients); //동기화.
	}
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("채팅서버가 시작되었습니다.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]에서 접속하였습니다." );
				
				// 채팅클라이언트가 접속(연결)이 되면서, 각각의 스레드객체로 관리된다. 
				ServerReceiver thread = new ServerReceiver(socket); // 소켓참조, 입출력스트림 객체생성작업
				thread.start();  // 접속자 소켓을 참조하는 스레드가 Runnable(실행대기상태)
			}
		}catch(Exception ex) {}
	} // start()
	
	//모든 채팅접속자에게 메시지를 일괄로 보내는 기능.
	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			}catch(IOException ex) {}
		}
	}
	
	
		
	public static void main(String[] args) {
		
		new TcpIpMultichatServer().start();
	}
	
	//중첩클래스
	class ServerReceiver extends Thread {
		Socket socket; // 클라이언트가 연결성공시 소켓객체를 참조
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream()); //입력스트림
				out = new DataOutputStream(socket.getOutputStream()); //출력스트림
			}catch(Exception ex) {}
		}
		
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF(); // 채팅클라이언트의 문자열을 읽기
				sendToAll("#"+name+"님이 들어오셨습니다.");
				
				clients.put(name, out); // 접속자 정보저장.
				System.out.println("현재 서버 접속자 수는 " + clients.size() + "입니다.");
				
				while(in != null) {
					// 접속한 사용자가 입력한 내용을 모든 접속자에게 보내는 기능.
					sendToAll(in.readUTF());
				}
			}catch(Exception ex) {
				
			}finally {
				//예외 여부와 상관없이 공통 또는 필수로 작업해야 하는 구문
				sendToAll("#"+name+"님이 나갔습니다.");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속을 종료하였습니다.");
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
			}
		}
	}

}
