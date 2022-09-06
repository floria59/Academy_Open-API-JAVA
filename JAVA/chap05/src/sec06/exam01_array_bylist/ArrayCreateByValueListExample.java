package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열 : 동일한 데이타타입으로 연속적인 기억장소를 생성하여 대표이름으로 관리하는 의미.
		
		// 참조타입 : 클래스, 배열, 열거형 등
		// 기본데이타타입[] : 배열의미가 되고, 참조타입
		int[] scores = {83, 90, 87, 90 };
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		System.out.println("scores[3]: " + scores[3]);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double)sum / 4;
		System.out.println("평균: " + avg);
		
		

	}

}
