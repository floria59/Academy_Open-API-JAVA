package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 필드 다형성
		RemoteControl rc = null;
		
		//자신의 재정의된 메소드를 호출한다.
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
