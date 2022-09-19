package sec02.runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100"; //숫자의 모습을 가지고 있는 문자열
		String data2 = "a100"; //문자열
		
		//숫자로 변환이 가능한 문자열만 매개변수로 사용해야 한다.
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // 오류데이타.  예외는  NumberFormatException클래스
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
