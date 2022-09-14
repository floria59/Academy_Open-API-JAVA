package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child(); //상속시 객체생성할 때 동작하는 과정.
		
		// child.method1();
		// child.method2(); 자신의 메서드를 호출. 부모 메서드는 super.메서드 호출
		// child.method3();
		
		// 자식클래스의 객체를 부모클래스의 객체로 형변환하여 대입.
		Parent parent = child; //자동형변환
		
		parent.method1();
		parent.method2(); // Child클래스의 method2()가 호출됨.(재정의)
		
		// parent.method3(); 호출 불가능.

	}

}
