package sec05.exam01_anonymous_extends;

public class Anonymouse {

	//익명구현객체를 필드선언
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	void method1() {
		//로컬클래스
		//로컬익명구현객체
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};
		
		//로컬변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
