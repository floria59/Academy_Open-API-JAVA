package sec06.exam02_yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start(); //우선순위 5. 기본값
		threadB.start(); //우선순위 5. 기본값
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		//main스레드에서 threadA, threadB를 제어
		threadA.work = false;
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
		

	}

}
