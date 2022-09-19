package sec03.exam01_member_class_access;

public class B {

	//B클래스를 JVM이 static멤버 여부를 체크하여, static멤버를 대상으로 static메모리영역에 기억장소를 생성한다.
	//static {} 블럭이 있으면, 자동으로 호출이 되어, 그안에서 static멤버들의 초기화 작업을 진행한다.
	
	int a;  //  B b = new B(); b.a접근
	static int b;
	
	//생성자메소드 : 인스턴스 멤버필드를 초기화하는 목적
	
	
	//static멤버필드를 초기화하는 목적.  
	static {
		b = 10;
		//a = 10; // 메모리가 생성되기 전에 작업을 하는 관점으로 해석되어, 문법적으로 지원을 안함.
	}
}
