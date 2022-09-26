package sec02.exam02_threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아래 구문을 실행하는 스레드 객체를 참조할수가 있다.
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 메인스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업자 스레드 이름: " + threadB.getName());
		threadB.start();

	}

}
