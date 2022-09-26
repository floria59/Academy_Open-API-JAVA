package sec06.exam04_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//공유자원으로 사용할 클래스 객체생성
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();

	}

}
