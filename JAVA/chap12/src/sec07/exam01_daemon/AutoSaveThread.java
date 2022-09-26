package sec07.exam01_daemon;

// 주작업의 스레드 목적이 아니라, 주작업의 스레드를 돕는 의미의 보조적인 스레드로 의미.
public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break; // 예외발생이 되면 동작함.
			}
			save(); // 1초마다 저장하는 기능.
		}
	}
}
