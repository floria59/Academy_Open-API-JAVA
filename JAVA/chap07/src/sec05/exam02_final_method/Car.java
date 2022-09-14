package sec05.exam02_final_method;

public class Car {

	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	// final 키워드사용. 그대로 상속받아서 사용
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
