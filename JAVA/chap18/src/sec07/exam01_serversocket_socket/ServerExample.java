package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		//서버통신프로그램
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			// 127.0.0.1컴퓨터에 서버통신프로그램을 5001포트로 작업을 해서 동작.
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // 127.0.0.1
			while(true) {
				System.out.println("[연결 기다림]");
				//클라이언트의 연결요청을 받을때까지 대기하고 있다가 연결요청이 오면, 수락을 하고, 소켓객체를 생성.
				// 소켓에는 클라이언트 정보가 존재한다.
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함 ]" + isa.getHostName()); // 연결된 클라이언트 호스트이름.
			}
		}catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}catch(IOException ex) {}
		}

	}

}
