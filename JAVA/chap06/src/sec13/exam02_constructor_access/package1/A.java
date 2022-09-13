package sec13.exam02_constructor_access.package1;

public class A {

	//클래스 내부에서 멤버들끼리 접근자는 의미가 없다.
	
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3= new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b){} //접근자 생략시는 default. 동일패키지에서는 public
	private A(String s) {}
}
