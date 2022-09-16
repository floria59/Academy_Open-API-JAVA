package sec02.exam04_default_method;

public interface RemoteControl {

	//상수.  static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드.  기존클래스의 일반메소드를 구성요소로 사용불가능.
	void turnOn(); // abstract 키워드 생략가능.
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
		
	}
}
