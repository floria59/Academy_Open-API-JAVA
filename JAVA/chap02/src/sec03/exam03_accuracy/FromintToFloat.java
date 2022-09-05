package sec03.exam03_accuracy;

public class FromintToFloat {

	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// 타입일치가 이루어지고 값이 할당된다.
		// 정수형 데이터타입보다는 실수형데이터타입이 크다.
		float num3 = num2; // 내부적으로 float num3 = (float) num2; 자동형변환
		num2 = (int) num3; // 명시적형변환 작업을 해야한다. 문법
		
		int result = num1 - num2; // 예상값 0
		System.out.println(result);

	}

}
