package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {

	//상수정의. 값을 위하여 만든이름.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	
	public int flyMode = NORMAL;


	// 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행중...");
		}else {
			super.fly(); //재정의시 숨겨진 부모클래스의 메소드 호출
		}
	}
	
	
}
