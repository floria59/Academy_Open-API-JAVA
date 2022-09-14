package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//부모클래스의 stop()메서드는 final키워드로 인하여, 재정의 할수가 없다.

	
}
