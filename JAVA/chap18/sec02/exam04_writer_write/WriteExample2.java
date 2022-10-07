package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/doccomsa/temp/test3.txt");
		char[] data = "홍길동".toCharArray(); // 문자열 -> 문자배열 변환
		
		writer.write(data); // 한번에 "홍길동" 문자열을 스트림에 저장.
		
		writer.flush();
		writer.close();

	}

}
