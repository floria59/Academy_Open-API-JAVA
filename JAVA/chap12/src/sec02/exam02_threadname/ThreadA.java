package sec02.exam02_threadname;

public class ThreadA extends Thread {

	//스레드 이름만들기
	public ThreadA() {
		setName("ThreadA"); // Setter메소드
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
