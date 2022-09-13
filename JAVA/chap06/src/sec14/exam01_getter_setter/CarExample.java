package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//음수값으로 문제가 발생
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		

	}

}
