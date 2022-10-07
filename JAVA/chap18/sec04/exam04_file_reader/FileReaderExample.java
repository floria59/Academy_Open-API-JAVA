package sec04.exam04_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		//문자기반 파일입력스트림예제
		FileReader fr = new FileReader("E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec04\\exam04_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		// readCharNo : 마지막 내용을 읽을시 문자 100개이하의 값이 저장된다.
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
