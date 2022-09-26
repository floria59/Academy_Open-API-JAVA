package sec04.exam01_unsynchronized;


//1)공유자원으로 사용할 클래스
public class Calculator {

	private int memory; //실제 공유자원으로 사용될 필드. 100 -> 50
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 현재 스레드는 2초간 일시정지상태가 된다. CPU는 다른 스레드를 동작시키게 된다.
		} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);

	}
}
