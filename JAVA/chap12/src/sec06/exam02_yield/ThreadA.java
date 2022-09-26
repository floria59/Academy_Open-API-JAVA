package sec06.exam02_yield;

//1)스레드 사용클래스
public class ThreadA extends Thread {
	public boolean stop = false; // -> true
	public boolean work = true;  // ->false
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업내용");
			}else {
				Thread.yield();// CPU점유를 양보. -> 대기상태
			}
		}
		System.out.println("ThreadA 종료");
	}
}
