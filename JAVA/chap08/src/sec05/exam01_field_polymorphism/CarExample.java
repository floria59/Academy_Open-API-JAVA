package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //객체선언및생성 구문.
		
		myCar.run();
		
		// 부모인터페이스 변수 = 자식구현객체;(다형성)
		myCar.frontLeftTire = new KumhooTire();
		myCar.frontRightTire = new KumhooTire();
		
		myCar.run();

	}

}
