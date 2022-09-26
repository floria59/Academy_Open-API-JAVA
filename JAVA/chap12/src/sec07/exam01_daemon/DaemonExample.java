package sec07.exam01_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 데몬스레드 설정.(보조스레드 의미로 봄)
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("메인스레드 종료");

	}

}
