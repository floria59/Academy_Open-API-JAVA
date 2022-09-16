package sec03.exam01_name_implements_class;

public class Audio implements RemoteControl {

	
	//필드
	private int volume; // 오디오의 현재볼륨상태. 
	
	//인터페이스를 상속하는 클래스는 추상메소드를 반드시 구현해야 한다.
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
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
		
		System.out.println("현재 오디오 볼륨: " + volume);
	}

	

}
