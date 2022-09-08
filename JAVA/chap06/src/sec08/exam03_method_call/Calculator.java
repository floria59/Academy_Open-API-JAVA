package sec08.exam03_method_call;

public class Calculator {

	// 메서드를 정의시 하나의 기능을 처리하는 구문으로 작성하자.
	
	// 두 수의 합
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 두 수의 평균
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
	}
}
	


