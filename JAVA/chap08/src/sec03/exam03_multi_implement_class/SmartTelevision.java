package sec03.exam03_multi_implement_class;


//인터페이스는 다중상속이 가능하다.
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	// Searchable인터페이스
	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");

	}

	
	// RemoteControl인터페이스 
	@Override
	public void turnOn() {
		System.out.println("SmartTelevision를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevision를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 SmartTelevision 볼륨: " + volume);
	}

}
