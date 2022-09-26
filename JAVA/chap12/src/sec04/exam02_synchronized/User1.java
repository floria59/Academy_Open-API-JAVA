package sec04.exam02_synchronized;

//2)스레드 클래스 : Calculator클래스를 공유자원으로 사용목적
public class User1 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}
}
