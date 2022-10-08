package sec05.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		//메인스트림
		InputStream is = System.in; //바이트기반 입력스트림
		Reader reader = new InputStreamReader(is); // 바이트->문자기반 입력스트림
		
		//보조스트림
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
		

	}

}
