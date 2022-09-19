package sec03.exam02_field_method_access;

public class A {

	// A a = new A();
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	
	//중첩클래스에 A클래스 멤버필드 모두접근
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//메모리 생성이 안되어 있는 상태에서 실행시 문제가 되기때문에, 사용을 못하도록 문법을 만들어 둠.
			//field1 = 10;
//			method1();
			
			//정적멤버만 사용가능.
			field2 = 10;
			method2();
		}
	}
}
