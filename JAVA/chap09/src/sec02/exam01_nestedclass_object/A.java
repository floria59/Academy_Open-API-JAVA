package sec02.exam01_nestedclass_object;

/*바깥 클래스*/
public class A {

	//중첩클래스.  1)인스턴스클래스, 2)정적클래스(static) 3)로컬클래스
	
	//1)인스턴스 클래스. 단 static 멤버 사용못함.
	public class B {
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
		void method1() {}
		
		//static멤버추가작업 못함.
		//static int field2;
		//static void method2() {};
	}
	
	//2)정적 클래스. 모든 멤버가 사용가능(인스턴스,static 을 말함)
	static class C {
		C() {System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	//3)로컬클래스. 메소드 내부에 정의한 클래스
	// 메소드는 호출에 의하여 바로실행.
	void method() {
		//로컬클래스. 단 static 멤버 사용못함.
		// 1)정의
		class D {
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			void method1() {}
			
			// static 멤버 사용못함.
			//static int field1;
			//static void method2( ) {};
		}
		//2)호출(사용)
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		System.out.println(d.field1);
		
		
		
	}
}
