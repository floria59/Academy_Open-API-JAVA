package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {

	//기본생성자로는 부모의 매개변수가 있는 생성자를 호출할수가 없다. 그래서, 자식클래스도 부모의 생성자를 호출하기위하여, 매개변수가 있는 생성자를 수동으로 생성.
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " 한국Tire 평크 ***");
			return false;
		}
	}

	
	
	

}
