package sec04.exam02_synchronized;


//1)공유자원으로 사용할 클래스
public class Calculator {

	private int memory; //실제 공유자원으로 사용될 필드. 
	
	public int getMemory() {
		return memory;
	}
	
	// user1스레드가 먼저 메소드를 사용하게되면, lock이 걸리게되고, user2스레드는 이메소드를 진입을 못하게된다.
	// user1스레드가 작업이 끝나야 비로소 unlock이 되어, user2스레드는 블럭상태가 해제가 되어 아래 메소드를 진입하게 된다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 현재 스레드는 2초간 일시정지상태가 된다. CPU는 다른 스레드를 동작시키게 된다.
		} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);

	}
}
