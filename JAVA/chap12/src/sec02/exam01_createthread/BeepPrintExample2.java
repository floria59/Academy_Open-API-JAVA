package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//스레드객체생성
		//방법1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); 
		
		// thread.run(); 이렇게 호출하면 안된다. 일반메소드 호출방식이다. 스레드로 동작이 안된다.
		thread.start(); //스레드에 의하여 run()메소드가 동작이된다. 실행대기상태로 등록
		
		//익명구현객체
		/*
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 1) 띵 소리나는 기능
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); // 띵 사운드 소리발생.
					try {
						Thread.sleep(500); // 0.5초 일시정지
					}catch(Exception e) {}
				}
				
			}
		});
		
		thread2.start();
		*/
		
		
		// 2)띵 문자열 출력.  main스레드의 main메소드에서 실행.
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // // 0.5초 일시정지
			}catch(Exception e) {}
		}

	}

}
