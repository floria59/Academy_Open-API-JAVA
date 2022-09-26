package sec06.exam06_stop;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000); // 1초 일시정지.
		}catch(InterruptedException e) {}
		
		thread.interrupt();

	}

}
