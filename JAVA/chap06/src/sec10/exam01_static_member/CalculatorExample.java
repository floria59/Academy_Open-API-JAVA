package sec10.exam01_static_member;

public class CalculatorExample {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		// 힙영역의 메모리 생성은 개발자가 의도를 갖고 아래 구문으로 작업
		Calculator myCal = new Calculator();
		// int result4 = myCal.multiply(10, 5);
		// System.out.println("result4 : " + result4);
		
		// myCal.pi 힙영역에서는 존재하지 않는다. static영역의 메모리를 접근한 의미
	}
}
