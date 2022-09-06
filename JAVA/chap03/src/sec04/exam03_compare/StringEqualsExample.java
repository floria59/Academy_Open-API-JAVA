package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 문자열데이타 비교
		
		// 데이타타입은 1)기본데이타타입(값타입)과 2)참조타입로 구분한다.
		// 구분 : 기억장소를 관리하는 방법이 다르다.
		
		// 1)기본데이타타입(원시타입) 8개 : 값타입(Value Type). 직접
		// byte,short(char),int,long,float,double, boolean
		// 값타입으로 기억장소를 생성하는 문법
		// 데이타타입 변수명;    예>  int a;
		
		
		// 2)참조타입: 클래스,열거형,배열 등 . 간접
		// 참조타입으로 기억장소를 생성하는 문법
		//  클래스명 변수명 = new 클래스명();
		
		// String 클래스? 문자열데이타를 저장하기위한 기억장소를 제공하고, 관련작업을 할때 사용
		// String 클래스는 2가지 유형으로 변수를 선언할수 가 있다.
		
		//문법1> 값타입 유형.
		// "홍길동" 문자열 데이타가 저장되어 있을 때,
		// 2번째부터 "홍길동" 데이타는 기존에 저장되어 있는 위치를 재사용.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		
		//문법2> 참조타입 유형
		// "홍길동" 문자열 데이타를 새로 생성해서 관리한다.
		String strVar3 = new String("홍길동");
		
		// == 같다.(동일하다). 값을 비교하는 것이 아니라 주소를 비교한다.
		
		// 주소비교
		System.out.println(strVar1 == strVar2); // true
		System.out.println(strVar1 == strVar3); // false
		
		// 값비교  equals()메서드
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // true
		System.out.println(strVar1.equals(strVar3)); // true
		
		

	}

}
