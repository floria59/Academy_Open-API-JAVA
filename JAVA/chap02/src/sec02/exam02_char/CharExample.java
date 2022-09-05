package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		// char데이타타입(2바이트) : 정수형테이타입. 문자 표현을 하기위한 목적. 내부적으로 숫자로 저장됨.
		// 1개의 문자의 의미로 값을 표현
		// 자바스크립트 : 문자열
		// 자바: 1)문자열 2)문자
		
		//동일한 값의 다른표현방식
		char c1 = 'A'; //문자를 직접저장
		char c2 = 65;  // 10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		// = 우측은 값으로 해석
		// char 데이타타입의 변수의 값을 숫자로 확인하고 자 할 경우
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println(uniCode);

	}

}

