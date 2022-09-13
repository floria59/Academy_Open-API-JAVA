package sec10.exam03_static_careful;

public class Car {

	//인스턴스 멤버
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// main()메서드는 Car클래스안에 작성은 되어있지만, Car클래스에 영향을 받지않는다.
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}

}
