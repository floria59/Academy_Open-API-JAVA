package sec05.exam04_casting;

public class Bus implements Vehicle {

	//구현메소드
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	
	//일반메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
