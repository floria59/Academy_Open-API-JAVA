package sec07.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			
			byte[] bytes = null;
			String message = null;
			
			//서버에 내용을 보내는 것.(출력스트림)
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			
			//서버에서 들어오는 내용.(입력스트림)
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes); // 입력스트림을 통하여, bytes배열에 저장.
			message = new String(bytes, 0, readByteCount, "UTF-8");
			
			os.close();
			is.close();
			
		}catch(Exception ex) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException ex) {}
		}

	}

}
