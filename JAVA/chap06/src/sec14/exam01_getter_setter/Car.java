package sec14.exam01_getter_setter;

public class Car {

	//필드
	private int speed; //기본값 0
	private boolean stop; // 기본값 false
	
	//메소드 : getter, setter 스프링에서는 메서드명이 규칙으로 작성해야 한다.
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
			
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
