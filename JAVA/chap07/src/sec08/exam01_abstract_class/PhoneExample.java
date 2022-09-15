package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		
		// 추상클래스는 객체를 생성할수가 없다.
		//Phone phone = new Phone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
