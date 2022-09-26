package sec06.exam06_stop;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		
		/* 방법1
		try {
			//예외가 발생이 안되면, 무한루프가 진행된다.
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1); // 0.001초 일시정지.
			}
		}catch(InterruptedException e) {
			System.out.println("예외발생");
		}
		*/
		
		//방법2
		while(true) {
			System.out.println("실행 중");
			// 자신을 가리키는 스레드에서 interrupt();메소드를 호출한 상황이 존재한다면, 아래구문이 true가된다.
			if(Thread.interrupted()) {
				break;
			}
		}
		
		
		// 아래 구문이 실행이 된 의미는 위에서 반복문에서 예외발생.
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
