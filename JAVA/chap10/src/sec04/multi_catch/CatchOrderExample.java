package sec04.multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		
		
		// Exception클래스 : 모든 예외클래스의 부모클래스이다.
		// 멀티캐치인 경우 예외클래스는 하위예외클래스에서 상위예외클래스로 구성해야 한다
		
		try {
			//1)예외발생 : 2개제공 필수
			String data1 = args[0];
			String data2 = args[1];
			
			//2)예외발생 : 숫자의 모습을 가지고 있는 문자열  NumberFormatException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 매개변수가 부족합니다. 2개 제공하세요");
			System.out.println("실행방법은 요?");
			System.out.println("java CatchByExceptionKIndExample num1 num2");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
