package sec02.exam03_abstract_method;

public interface RemoteControl {

	//상수.  static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드.  기존클래스의 일반메소드를 구성요소로 사용불가능.
	void turnOn(); // abstract 키워드 생략가능.
	void turnOff();
	void setVolume(int volume);
}
