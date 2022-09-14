package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // 타이어 4개를 가지고 있는 객체.
		
		// 타이어 상태를 체크해서 교체.
		// 반복문의 회수가 거듭될수록 누적회전수가 증가되고, 최대회전수와 같거나 큰 경우 타이어 교체발생됨.
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 한국타이어 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 금호타이어 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 한국타이어 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른족 금호타이어 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			
			System.out.println("===================================");
			
		}

	}

}
