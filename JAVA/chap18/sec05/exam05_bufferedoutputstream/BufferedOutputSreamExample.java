package sec05.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputSreamExample {

	public static void main(String[] args) throws Exception {
		
		//출력스트림 작업에서 버퍼보조스트림 사용유무에 따른 속도차이 예제.
		
		//메인스트림
		FileInputStream fis = null; // 파일대상 바이트기반 입력스트림
		FileOutputStream fos = null; // 파일대상 바이트기반 출력스트림.
		
		//보조스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec05\\exam05_bufferedoutputstream\\forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("E:\\doccomsa\\temp\\forest_copy.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) { // 입력스트림(읽기)에서는 버퍼사용
			fos.write(data); // 출력스트림(쓰기)에서는 버퍼 사용안함.
		}
		fos.flush();
		end = System.currentTimeMillis();
		// 객체생성의 역순으로 close() 한다.
		fos.close(); bis.close(); fis.close();
		System.out.println("출력스트림에서 버퍼를 사용하지 않았을 때: " + (end-start) + "ms");
		
		fis = new FileInputStream("E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec05\\exam05_bufferedoutputstream\\forest.jpg");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("E:\\doccomsa\\temp\\forest_copy.jpg"); // 최초 생성시 파일크기는 0바이트
		bos = new BufferedOutputStream(fos); //출력버퍼 보조스트림
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data); //출력스트림(쓰기)에서는 버퍼 사용함.
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("출력스트림에서 버퍼를 사용했을 때 : " + (end-start) + "ms");
		

	}

}
