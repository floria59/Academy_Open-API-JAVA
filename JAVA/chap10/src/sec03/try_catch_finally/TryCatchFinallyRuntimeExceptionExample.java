package sec03.try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		// 2개의 예외가 발생하는 구문.
		
		String data1 = null;
		String data2 = null;
		try {
			// 1)매개변수 2개를 제공여부에 따라서 예외발생
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample  num1  num2");
			return;
		} 
		
		try { 
			// 2)숫자로 변환시 예외발생 소지.
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

