package sec03.exam01_system_in_out;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws Exception {
		
		// 콘솔환경에서 데이터를 읽어들이고, 쓰는 작업을 제공하는 기능 : 표준입출력 스트림.
		
		// System.in : 표준입력스트림. 콘솔환경에서 키보드를 통하여 입력받은 데이터를 읽어들이는 스트림.
		
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요.");
		
		InputStream is = System.in;
		char inputChar = (char) is.read(); // 콘솔환경에서 데이터를 입력받는 기능을 제공하고, 읽어들이는 기능도 제공
		switch(inputChar) {
			case '1':
				System.out.println("예금 조회를 선택함.");
				break;
			case '2':
				System.out.println("예금 출금을 선택함.");
				break;
			case '3':
				System.out.println("예금 입금을 선택함.");
				break;
			case '4':
				System.out.println("종료 하기를선택함.");
				break;
		}
	}

}
