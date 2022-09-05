package sec03.exam04_operation;

public class OperationsPromotion {

	public static void main(String[] args) {
		
		/* 변수로 사용시 (int형 아래 데이터타입끼리 연산시에는 결과가 int형으로 해석됨)
		 * byte변수 + byte변수 = int
		 * char변수 + char변수 = int
		 * byte변수 + short변수 = int
		 */
		
		
		
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		
		// byte -128 ~ 127범위
		// byte 변수끼리의 합의 결과를 int로 해석하도록 되어 있다.
		// byte bytevalue3 = bytevalue1 + bytevalue2; 에러남. 
		byte bytevalue3 = (byte) (bytevalue1 + bytevalue2);
		
		//int bytevalue1 = bytevalue1 + bytevalue2;
		
		// 0 ~ 65535범위
		char charvalue1 = 'A';
		char charvalue2 = 1;
		int charvalue3 = charvalue1 + charvalue2;
		
		System.out.println("유니코드값: " + charvalue2);
		System.out.println("출력문자: " + (char)charvalue2);
		
		// 정수데이터타입끼리의 연산결과는 정수
		
		int intvalue3 = 10;
		int intvalue4 = intvalue3 / 4;
		System.out.println(intvalue4);
		
		// 서로 다른 데이터타입끼리 연산시 가장 큰데이터타입으로 형변환이 발생
		// 연산시에도 타입이 일치되는 작업이 이루어져야한다. 
		int intvalue5 = 10;
		//int intvalue6 = 10 / 4.0;
		double doublevalue = 10 / 4.0;
		System.out.println(doublevalue);
	}

}
