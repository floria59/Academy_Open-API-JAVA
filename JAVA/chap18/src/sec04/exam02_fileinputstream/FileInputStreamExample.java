package sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args){
		//바이트기반의 파일입력스트림
		try {
			FileInputStream fis = new FileInputStream("E:/doccomsa/Program Files/workspace/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data); // write()메소드 : data변수의 코드에 해당하는 문자로 출력하는 기능
		}
			fis.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
