package sec04.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutpustStreamExample {

	public static void main(String[] args) throws Exception {
		// 파일복사
		String originalFileName = "E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec04\\exam03_fileoutputstream\\house.jpg";
		String targetFileName = "E:\\doccomsa\\temp\\house2.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			// 원본파일 크기가 다를수 있다.
			// 맨마지막 while이 동작시 readBytes(100byte) 바이트수로 저장한다.
			//fos.write(readBytes); //49.5KB (50,700 바이트) house.jpg
			// 맨마지막 while이 동작시 실제읽은 바이트수로 저장한다.
			fos.write(readBytes,0, readByteNo); // 49.4KB (50,670 바이트) house2.jpg
		}
		
		fos.flush();
		fos.close();
		// fis.flush(); 지원안함
		fis.close();
		
		System.out.println("복사가 성공됨");

	}

}
