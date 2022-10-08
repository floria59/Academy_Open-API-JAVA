package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//버퍼기능의 보조스트림 이용유무에 따라서 처리속도를 확인하는 예제.
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		start = System.currentTimeMillis(); // 밀리세컨드 = 1초를 1000분의 1로 환산한 단위.   예> 1000 밀리세컨드 = 1초
		while(fis1.read() != -1) { } // read() : 1바이트씩 읽고, 커서를 앞으로 이동시킨다.
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("E:\\doccomsa\\Program Files\\workspace\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) { }
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용했을 때: " + (end-start) + "ms");
		// 객체 생성의 역순으로 close()작업해야 한다.
		bis.close();
		fis2.close();
		

	}

}
