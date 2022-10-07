package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("E:/doccomsa/temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8]; // readBytes[0] ~ readBytes[7]
		//is파일입력스트림이 readBytes 바이트배열저장소에 인덱스 2위치에 3개를 읽어서 저장함.
		readByteNo = is.read(readBytes, 2, 3); // readBytes[2]
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
				

	}

}
