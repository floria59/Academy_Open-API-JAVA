package sec03.exam01_priority;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name); //스레드이름 변경.
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000000000; i++) {
			
		}
		System.out.println(getName()); //스레드이름 출력
	}
}
