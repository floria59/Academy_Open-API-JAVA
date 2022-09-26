package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); //3초가 일시정지. 시간이 경과된 후에 실행대기상태
			}catch(InterruptedException e) {
				
			}
		}

	}

}
