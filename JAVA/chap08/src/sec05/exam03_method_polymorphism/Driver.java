package sec05.exam03_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run(); //버스 또는 택시에 따른 자신의 run()메소드를 호출
	}
}
