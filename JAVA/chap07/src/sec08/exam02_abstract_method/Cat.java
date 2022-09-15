package sec08.exam02_abstract_method;

//추상클래스를 상속받는 경우 자식클래스는 추상메서드를 반드시 구현(재정의)해야 한다.
public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

}
