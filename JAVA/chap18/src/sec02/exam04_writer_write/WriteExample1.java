package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/doccomsa/temp/test3.txt");
		char[] data = "홍길동".toCharArray(); // 문자열 -> 문자배열 변환
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]); // 스트림에 저장(채움)
		}
		
		writer.flush();
		writer.close();

	}

}
