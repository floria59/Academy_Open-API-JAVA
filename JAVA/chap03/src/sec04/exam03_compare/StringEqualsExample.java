package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이타타입은 1)기본데이타타입(값타입)과 2)참조타입로 구분한다.
		// 구분 : 기억장소를 관리하는 방법이 다르다.
		
		// 1)기본데이타타입(원시타입) 8개 : 값타입(Value Type). 직접
		// byte,short(char),int,long,float,double, boolean
		// 값타입으로 기억장소를 생성하는 문법
		// 데이타타입 변수명;    예>  int a;
		
		
		// 2)참조타입: 클래스,열거형,배열 등 . 간접
		// 참조타입으로 기억장소를 생성하는 문법
		//  클래스명 변수명 = new 클래스명();
		
		// String 클래스는 2가지 유형으로 변수를 선언할수 가 있다.
		
		//문법1> 값타입 유형.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		
		//문법2> 참조타입 유형
		String strVar3 = new String("홍길동");

	}

}
