package sec01.exam01;

public class VariableExample {

	public static void main(String[] args) {
		// 기억장소 생성 : 데이터타입
		// 정수데이타를 보관하고 싶은 기억장소 생성 : 어떤 데이터타입?
		// byte, short, char, int, long
		// 사용법 : 데이터타입 이름(변수);
		
		int value; // int형 데이터타입 4바이트로 기억장소를 생성하고, 이름은 value라고 한다.
		int value2;
		int value3;
		
		// 기억장소에 데이터를 저장할때의 문법
		// 변수명 = 값;
		
		value = 10; // value라는 기억장소에 10을 저장, 보관, 할당한다. 
		value2 = 100;
		value3 = 1000;
		
		int value4 = 10000;
		
		// 변수에 새로운 값을 대입하는 방법
		// 변수에 새로운 값을 대입하게되면 이전의 값 10이 소멸되고, 새로운 값이 존재하게 된다.
		int value5 = 10;
		value5 = 20; 
		
		// = 대입연산자 , 우측의 값을 좌측의 기억장소에 저장하는 기능
		// 좌측 : 기억장소해석 / 우측 : 값으로 해석
		int value6 = 10;
		int result = value6 + 20;
		
		// System.out.println(); : ()안의 값을 해석하여 콘솔에 출력하는 기능
		System.out.println(result);
		System.out.println(value);		
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
