package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		// 클라이언트 통신프로그램
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			// "localhost" 컴퓨터의 5001포트로 실행중인 프로그램에 연결시도.
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		}catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException ex) {}
		}

	}

}
