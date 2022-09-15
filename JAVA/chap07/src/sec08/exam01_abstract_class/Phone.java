package sec08.exam01_abstract_class;

//클래스? 객체를 생성하기위한 설계도.
// 추상클래스(미완성) : abstract class
// 객체생성을 할수가 없고, 상속을 위한 목적
public abstract class Phone {

	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
