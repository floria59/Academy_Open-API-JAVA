package sec05.exam01_inputstreamreader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		//메인스트림 생성(1차). 바이트기반
		InputStream is = System.in; // 표준입력스트림기능을 제공
		
		//보조스트림(2차). 바이트기반 -> 문자기반으로 변환
		//InputStreamReader inputStreamReader = new InputStreamReader(is);
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
		

	}

}
