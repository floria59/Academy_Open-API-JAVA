package sec02.exam02_threadname;

public class ThreadB extends Thread {

	// 스레드 이름을 수동으로 만들지 않았으므로, 기본으로 제공하는 스레드이름
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
