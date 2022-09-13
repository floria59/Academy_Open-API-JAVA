package sec13.exam03_field_method_access.package1;

public class A {

	//필드
	public int field1;
	int field2; // 접근자 생략시 default.   같은패키지에서 접근시 public, 다른패키지에서 접근시 private
	private int field3;
	
	//생성자
	public A() {
		
		// 멤버끼리 사용시는 접근자는 상관없다.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
