package sec08.exam01_threadgroup;

public class WorkThread extends Thread {

	//WorkThread스레드 클래스를 스레드객체생성을 할때, 아래 매개변수의 생성자를 이용하여, 스레드그룹을 지정하는 목적으로 사용 
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 스레드가 sleep() 일시정시상태에서, interrupt()메소드가 호출되면 InterruptedException 예외발생
			}catch(InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
