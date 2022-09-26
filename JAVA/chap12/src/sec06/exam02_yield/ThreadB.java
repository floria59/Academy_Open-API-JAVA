package sec06.exam02_yield;

//1)스레드 사용클래스
public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업내용");
			}else {
				ThreadB.yield();// CPU점유를 양보. -> 대기상태
			}
		}
		System.out.println("ThreadB 종료");
	}
}
