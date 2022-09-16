package sec04.exam01_abstract_method_use;

//객체생성불가, 상속목적, 다중상속
public interface RemoteControl {

	//상수.  static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드.  기존클래스의 일반메소드를 구성요소로 사용불가능.
	void turnOn(); // abstract 키워드 생략가능.
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 : 일반메소드 성격
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
		
	}
	
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
