package sec02.exam02_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		// 파일을 생성하여, (문자열)내용을 쓰는 작업.
		//출력스트림 객체생성 : 파일이 새로생성.(파일이 존재하면, 삭제하고 새로 생성됨)
		OutputStream os = new FileOutputStream("E:/doccomsa/temp/test2.txt");
		byte[] data = "ABC".getBytes(); // 문자열 -> 바이트로 변환
		for(int i=0; i<data.length; i++) {
			// os출력스트림객체를 이용하여, data배열에 저장되어있는 내용을 스트림에 쓴다.(빨대에 저장)
			os.write(data);
		}
		
		os.flush(); // 스트림에 저장되어 있는 데이타를 test2.txt파일에 내보낸다. 스트림공간은 빈상태
		os.close(); //파일에 연결끊기.

	}

}
