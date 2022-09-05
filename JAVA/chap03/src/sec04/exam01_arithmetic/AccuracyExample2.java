package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
		
		// AccuracyExample1.java 파일의 실수형데이타타입 표현에 따른 오차문제로
		// 다음과 같은 대안으로 코드가 작성됨.
		
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서 0.7조각을 빼면, 몇조각이 남느냐?");
		System.out.println(result);

	}

}
