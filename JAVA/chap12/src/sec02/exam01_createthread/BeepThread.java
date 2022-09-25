package sec02.exam01_createthread;

import java.awt.Toolkit;

//2)Thread클래스를 상속방식
public class BeepThread extends Thread {

	//일반메소드를 재정의
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
}
