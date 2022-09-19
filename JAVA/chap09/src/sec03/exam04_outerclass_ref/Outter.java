package sec03.exam04_outerclass_ref;

public class Outter {

	//멤버끼리는 접근자는 상관없다.
	
	String field = "Outer-field";
	void method() {
		System.out.println("Outer-method");
	}
	
	//중첩클래스
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
