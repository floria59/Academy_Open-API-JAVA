package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//접근 불가
//		vehicle.checkFare();
		
		//위의 메소드를 접근하기위하여 어떻게?
		Bus bus = (Bus) vehicle; //강제적 형변환(명시적)
		bus.run();
		bus.checkFare();
		


	}

}
