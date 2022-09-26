package sec05.exam01_state;

//1) 스레드클래스는 스레드 상태를 확인하는 용도
public class TargetThread extends Thread {

	@Override
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		//1.5초가 일시정지되었다가 시간이 지나면 -> 실행대기상태
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		for(long i=0; i<1000000000; i++) {}
		
	}
}
