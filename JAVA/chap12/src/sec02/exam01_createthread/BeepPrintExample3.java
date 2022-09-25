package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//스레드 객체생성
		Thread thread = new BeepThread();
		
		// run()메소드를 호출하는 의미는 아니다.
		// run()메소드를 참조하는 스레드를 독립적인 성격으로 만들고, CPU의 점유를 받을수 있는 상태로 만들어준다.
		thread.start(); 
		
		//익명구현객체
		/*
		Thread thread2 = new Thread() {
			public void run() {
				// 1) 띵 소리나는 기능
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); // 띵 사운드 소리발생.
					try {
						Thread.sleep(500); // 0.5초 일시정지
					}catch(Exception e) {}
				}
			};
		};
		
		thread2.start();
		*/
		
		// 2)띵 문자열 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // // 0.5초 일시정지
			}catch(Exception e) {}
		}

	}

}
