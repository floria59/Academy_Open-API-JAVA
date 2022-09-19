package sec03.exam03_localclass_access;

public class Outer {

	//로컬클래스 : 메서드안에 정의한 중첩클래스
	//자바 7이전 final int arg 로 사용해야 , 내부에서 전역으로 사용이 가능
	//자바 8이후 final 생략하고 사용한다.
	
	//메소드의 매개변수및지역변수를 사용시 로컬클래스에서 제한이 있는데, final의 특성을 부여해두었다.
	// final 의미? 값을 변경이 불가능하다.
	
	//자바 7
	public void mehtod1(final int arg) {
		final int localVariable = 1;
		
		//arg = 100; //에러
		
		//익명클래스에서 사용하고자 할경우.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8
	public void mehtod2(/*final 생략함*/int arg ) {
		/*final 생략함*/ int localVariable = 1;
		
		//arg = 100; //에러
		//익명클래스에서 사용하고자 할경우.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//내부에 익명클래스를 사용 안했을 경우에는 상관이 없다.
	public void method3(int arg) {
		arg = 100;
	}
}
