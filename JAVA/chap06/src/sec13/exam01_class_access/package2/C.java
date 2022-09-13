package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.B;

//접근자 생략시 default 라고 한다.
class C {
 // A a; 다른 패키지이고, default이므로 접근 불가(private)
	B b; // 다른 패키지이지만, B클래스가 public 이므로 접근 가능.
}
