package sec04.multi_catch;

public class CatchByExceptionKIndExample {

	public static void main(String[] args) {
		// 구문에서 여러가지 예외가 발생하는 것을 예상하고 처리할 때 멀티캐치 구문으로 예외처리해야 한다.
		// 예외처리의 목적? 근본적인 원인을 처리하고자 함이 아니라, 비정상적인 종료를 막고, 마지막까지 응용프로그램 실행의 목적
		try {
			//1)예외발생 : 2개제공 필수
			String data1 = args[0];
			String data2 = args[1];
			
			//2)예외발생 : 숫자의 모습을 가지고 있는 문자열
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 매개변수가 부족합니다. 2개 제공하세요");
			System.out.println("실행방법은 요?");
			System.out.println("java CatchByExceptionKIndExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가능합니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
