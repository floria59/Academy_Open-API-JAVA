package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("E:/doccomsa/temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		//cbuf배열의 인덱스 1위치에 스트림으로부터  문자2개를 읽어와서 저장한다.
		readCharNo = reader.read(cbuf, 1, 2);
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		
		reader.close();

	}

}
