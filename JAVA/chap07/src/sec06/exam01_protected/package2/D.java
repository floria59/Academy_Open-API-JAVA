package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

//다른 패키지이지만, 상속관계에서 사용. 접근가능.
public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
