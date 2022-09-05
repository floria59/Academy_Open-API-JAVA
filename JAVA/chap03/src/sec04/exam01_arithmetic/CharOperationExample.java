package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		// 10 int형데이타.  int형이하 데이타타입은 형변환 작업을 자동처리 해줌.
		// 값으로 연산시는 데이타타입이 문제없이 처리가 됨.
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		// 0 ~ 65535
		//변수로 연산시는 int형으로 처리됨.
		//char c3 = c2 + 1;
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);

	}

}
