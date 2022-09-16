package sec05.exam01_field_polymorphism;

// 구현클래스
public class HankookTire implements Tire {

	// 추상메서드 구현
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");

	}

}
