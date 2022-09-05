package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		
		// AccuracyExample1.java, AccuracyExample2.java 함께 공부.
		// 실수형 데이타타입의 기억장소는 실수값을 표현하는 방식이 정수형데이타타입가 다르다.
		
		// 0.1을 100번 더하면 100이 출력되어야 하는 데 100이 출력이 안된다.
		// 부호비트+지수비트+가수비트 자리수.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 0.7조각을 빼면, 몇조각이 남느냐?");
		System.out.println(result); // 예상 0.3조각. 결과는? 0.29999999999999993 

	}

}
