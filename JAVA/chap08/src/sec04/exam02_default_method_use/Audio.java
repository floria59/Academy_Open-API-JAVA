package sec04.exam02_default_method_use;

public class Audio implements RemoteControl {

	
	//필드
	private int volume; // 오디오의 현재볼륨상태. 
	private boolean mute;
	
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
	
	// 디폴트, 정적메소드는 호출해서 사용
	// 재정의 해서 사용.
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음처리");
		}else {
			System.out.println("오디오 무음해제");
		}
		
	}

	

}
