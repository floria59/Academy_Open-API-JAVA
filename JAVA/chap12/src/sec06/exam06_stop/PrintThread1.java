package sec06.exam06_stop;

public class PrintThread1 extends Thread {

	//StopFlag기법.
	private boolean stop; //기본값 false - > true
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
