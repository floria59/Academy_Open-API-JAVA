package sec07.exam03_field_polymorphism;

// 필드의 다형성
// 필드 : 타이어 필드가 한국타이어 또는 금호타이어 등 여러개의 타이어회사의 성격을 갖게 되는 의미.

// 자동차클래스
// 1)타이어를 장착 2) 달린다.
public class Car {

	//필드
	// 표준바퀴 장착
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달린다.");
		if(frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTire.roll() == false) {
			stop(); return 2;
		}
		if(backLeftTire.roll() == false) {
			stop(); return 3;
		}
		if(backRightTire.roll() == false) {
			stop(); return 4;
		}
		
		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차를 멈춥니다.");
	}
}
