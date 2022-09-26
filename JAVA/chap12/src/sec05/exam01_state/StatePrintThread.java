package sec05.exam01_state;

//2) TargetThread 스레드클래스의 스레드상태를 제어및 출력하는 용도
public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			//스레드 상태의 열거형 변수
			Thread.State state =  targetThread.getState();
			System.out.println("타켓 스레드 상태: " + state);
			if(state == Thread.State.NEW) { // 스레드 객체생성된 상태.
				targetThread.start(); // 실행대기상태 변경
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			// 0.5초가 일시정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
