package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

//다른 패키지이고, 상속관계없이 사용하고자 한 경우. 접근 불가능.
public class C {

	public void method() {
		//A a = new A();  다른 패키지일 경우에는 private반응
	}
}
