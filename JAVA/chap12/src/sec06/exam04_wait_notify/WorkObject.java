package sec06.exam04_wait_notify;

//공유자원으로 사용될 클래스
public class WorkObject {

	//작업스레드 ThreadA클래스가 호출
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify(); // wait()메소드로 일시정지된 스레드를 Runnable(실행대기상태)로 전환시켜주는 기능
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	//작업스레드 ThreadB클래스가 호출
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify(); // wait()메소드로 일시정지된 스레드를 Runnable(실행대기상태)로 전환시켜주는 기능
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	
}
