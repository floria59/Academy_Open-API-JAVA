package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	//main스레드에 의하여 main메소드 제어.
	public static void main(String[] args) {
		
		// 기본적으로 제공해주는 main스레드 하나로 아래와 같은 작업은 불가능하다.
		// 띵소리와 "띵"문자열 출력 동시에 함께 결과진행을 할수가 없다.
		
		// 1) 띵 소리나는 기능
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 띵 사운드 소리발생.
			try {
				Thread.sleep(500); // 0.5초 일시정지
			}catch(Exception e) {}
		}
		
		// 2)띵 문자열 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // // 0.5초 일시정지
			}catch(Exception e) {}
		}

	}

}
