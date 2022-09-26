package sec06.exam06_stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		
		//main스레드가 1초간 일시정지되었다가 경과후 runnable상태로 되고
		//cpu점유를 받게되어 아래코드가 실행이 되면.
		printThread1.setStop(true);
		

	}

}
