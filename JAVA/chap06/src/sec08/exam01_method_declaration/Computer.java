package sec08.exam01_method_declaration;

public class Computer {
	
	// 파라미터가 참조타입인 경우에는 힙영역에 생성된 기억장소 주소가 대입된다. 
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 매개변수에 제공하는 인수값이 제한이 없다 . 0 개이상이 가능하다.
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
