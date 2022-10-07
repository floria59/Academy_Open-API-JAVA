package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		//자원 : 파일 
		// 내용: Hello World!!!
		// 방향 : 입력
		// 바이트기반 : 스트림
		// 파일입력스트림(파일내용읽기)은 데이타가 존재해야 한다.
		// 디버깅
		InputStream is = new FileInputStream("E:/doccomsa/temp/test.txt");
		int readByte; // 데이터 읽은 저장소
		while(true) {
			readByte = is.read(); //한바이트씩 읽고, 앞으로 포인터(커서)위치가 이동. 포인터는 첫줄의 첫문자에 위치한다.
			if(readByte == -1) break;
			System.out.println((char) readByte);
		}
		
		is.close();
		

	}

}
