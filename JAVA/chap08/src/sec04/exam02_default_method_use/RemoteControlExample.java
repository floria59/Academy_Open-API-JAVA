package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 필드 다형성
		RemoteControl rc = null;
		
		//자신의 재정의된 메소드를 호출한다.
		rc = new Television();
		rc.turnOn();
		rc.setMute(true); // 재정의를 안해서 호출은 부모인터페이스의 디폴트메소드 호출됨.
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true); // 재정의된 메소드 호출됨.

	}

}
