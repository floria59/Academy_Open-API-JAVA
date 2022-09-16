package sec03.exam02_noname_implements_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명구현객체. 일회성목적
		// 클래스로 상속받아 만들지 않고, 직접 사용한 경우.
		// 아래 내용을 현재 클래스 파일에서만 사용하고, 다른곳에서는 사용이 안되는 경우
		RemoteControl rc = new RemoteControl() {
			
			public int volume = 10;
			
			public void methodA() {}
			
			
			// 상속받은 클래스의 내용과 동일한 의미.
			@Override
			public void turnOn() { /*내용*/}
			@Override
			public void turnOff() {}
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				methodA();
			}
		};
		
		
		rc.turnOn();
		
		
		
		
		// 클래스로 상속받아 사용하는 이유는? 다른 곳 어디에서든 객체생성해서, 반복적으로 사용하고자하는 목적.

	}

}
