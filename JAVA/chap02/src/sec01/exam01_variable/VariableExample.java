package sec01.exam01_variable;

public class VariableExample {

	public static void main(String[] args) {
		
		//기억장소 생성 : 데이타타입
		// 정수데이타를 보관하고 싶은 기억장소 생성 : 어떤 데이타타입?
		// byte, short, char, int, long
		// 사용법:   데이타타입  이름(변수);
		
		int value;  // int형 데이타타입이 4바이트로 기억장소를 생성하고, 이름을 value 라고 한다.
		int value2;
		int value3;
		
		// 기억장소에 데이타를 저장할 때 문법
		// 변수명 = 값;
		value = 10;  // value라는 기억장소에 10을 저장한다. 보관한다. 대입한다. 할당한다.
		value2 = 100;
		value3 = 1000;
		
		int value4 = 10000;
		/*
		 int value4;
		 value4 = 10000; 
		 */
		
		//변수에 새로운 값을 대입하는 방법.
		//변수에 새로운 값을 대입하면, 이전의 값은 소멸되고, 새로운 값이 존재한다.
		int value5 = 10;
		value5 = 20;
		
		// = 대입연산자. 1)좌측 : 기억장소해석  2)우측 : 값으로 해석 
		// 우측의 값을 좌측의 기억장소에 저장(할당)하는 기능.
		int value6 = 10;
		int result = value6 + 20;
		
		
		// System.out.println() : ()안을 값으로 해석하여 콘솔에 출력하는 기능.
		System.out.println(result);
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		
		

	}

}
