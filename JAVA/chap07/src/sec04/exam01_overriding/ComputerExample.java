package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		//독립적으로 클래스 객체생성(부모클래스)
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		//상속관계하에 클래스 객체생성
		Computer computer = new Computer();
		//자식객체의 메소드 호출됨. 의문점?부모클래스의 동일한 areaCircle()메서드는 호출어떻게 하지?
		System.out.println("원면적: " + computer.areaCircle(r));

	}

}
