package sec06.exam01_protected.package1;

// protected : 상속목적의 접근자.
// 같은 패키지일 경우에는 public 반응. 접근가능
// 다른 패키지일 경우에는 private반응.  접근불가능.
// 다른 패키지이지만 상속관계에서는 public반응. 접근가능.
public class A {

	protected String field;
	
	protected A() {
		
	}
	
	protected void method() {
		
	}
}
