package sec03.exam01_sign;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 부호연산자. +, -
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		//int형보다 아래 데이타타입에서는 숫자를 사용해도 처리가 이상없이 동작되도록 설계되어 있다.
		// 100 값은 int형으로 인식된다.(기본)
		short s = 100;
		//short result3 = -s; // short형 변수에 부호를 사용하면, int로 형변환 발생됨.

	}

}
