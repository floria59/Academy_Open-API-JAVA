package sec07.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(); //서버통신프로그램 서버소켓객체생성
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // 통신프로그램의 IP,Port설정
			
			//실행중인 상태유지.  반복문 필수.
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); // 소켓객체생성이 되면, 클라이언트 연결성공.
				
				//클라이언트 정보
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함 ]" + isa.getHostName());
				
				
				byte[] bytes = null;
				String message = null;
				
				//입력스트림 : 클라이언트가 보낸 메세지를 읽기위한 목적(읽어들이는 것)
				InputStream is = socket.getInputStream();
				bytes = new byte[100]; //메세지 임시저장소
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]: " + message);
				
				//출력스트림 : 서버에서 클라이언트로 메세지를 쓰기위한 목적(내보내는 것)
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush(); //서버에서 클라이언트에게 메세지 보내는 작업.
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();				
			}			
			
		}catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}catch(IOException ex) {}
		}

	}

}
