package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override // 어노테이션. 컴파일러에게 아래 메서드는 상속관계에서 부모클래스의 메서드를 재정의 하는 것이라고 정보제공
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
		
	}

	
	
}
