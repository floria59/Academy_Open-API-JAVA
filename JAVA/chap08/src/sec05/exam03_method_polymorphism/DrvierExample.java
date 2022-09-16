package sec05.exam03_method_polymorphism;

public class DrvierExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
		

	}

}
