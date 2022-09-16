package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		// 객체타입확인 : vehicle변수가 Bus객체 타입인지 체크
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		

		vehicle.run();
	}
}
