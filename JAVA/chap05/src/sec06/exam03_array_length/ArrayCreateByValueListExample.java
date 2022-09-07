package sec06.exam03_array_length;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열 : 동일한 데이타타입으로 연속적인 기억장소를 생성하여 대표이름으로 관리하는 의미.
		
		// 참조타입 : 클래스, 배열, 열거형 , 인터페이스
		// 기본데이타타입[] : 배열의미가 되고, 참조타입
		int[] scores = {83, 90, 87 };
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
 
		//  배열의 요소개수 : length 필드(속성)
		
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);
		
		

	}

}
