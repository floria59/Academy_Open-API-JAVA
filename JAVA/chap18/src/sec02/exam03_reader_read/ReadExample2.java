package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("E:/doccomsa/temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2]; // 임시저장소
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo); // 문자 -> String 변환
		}
		System.out.println(data);
		
		reader.close();

	}

}
