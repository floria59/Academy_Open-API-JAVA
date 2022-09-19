package sec05.exam01_anonymous_extends;

public class AnonymouseExample {

	public static void main(String[] args) {
		Anonymouse anony = new Anonymouse();
		
		anony.field.turnOn();
		
		anony.method1();
		
		//상속받은 클래스가 없다.
		//익명구현객체를 매개변수의 값으로 사용
		anony.method2(
			new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
					
				}
				
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
					
				}
			}	
		);

	}

}
