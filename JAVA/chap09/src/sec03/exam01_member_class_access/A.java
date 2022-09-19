package sec03.exam01_member_class_access;

public class A {

	
	//static메서드안에서는 인스턴스 멤버는 사용할수가 없다. 객체를 생성하여 사용이 가능하다.
	
	//싱글톤 디자인패턴.
	//private static A a = new A();
	
	//중첩클래스는 외부에서는 거의 사용할 경우는 드물고, 내부에서 생성하여 사용한다.
	//객체생성
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		//객체생성하여 사용한다.
		B var1 = new B();
		C var2 = new C();
	}
	
	static C field4 = new C();
	
	//정적멤버는 static메모리영역에 메모리가 생성이 되어 있어, 인스턴스 멤버를 사용이 불가능하다.
	//이유는 인스턴스 멤버를 가지고 있는 클래스가 new 생성자() 객체생성 작업이 진행이 되어야 만 가능한데.
	// 그 작업은 개발자가 코딩표현을 하지않으면, 메모리가 생성되지 않기 때문에
	//그래서 stati메소드안에서 실행시 문제가 되므로, 사용불가 하도록 되어 있다.
	static void method2() {
		//인스턴스멤버는 사용불가.
		//B var1 = new B(); 
		
		C var2 = new C();
	}
	
	
	//중첩클래스
	
	//1)인스턴스 멤버클래스
	class B{/*구성요소(멤버)*/}
	
	//2)정적 멤버클래스
	static class C {/*구성요소(멤버)*/}
}
