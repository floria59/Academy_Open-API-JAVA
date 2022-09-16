package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		// 부모인터페이스 변수 = 자식구현객체;(다형성)
		myCar.tires[0] = new KumhooTire();
		myCar.tires[1] = new KumhooTire();
		
		myCar.run();

	}

}
