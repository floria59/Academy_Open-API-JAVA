package sec04.exam01_overriding;

public class Calculator {

	/*
	 * 선언부                                             실행부
	  double areaCircle(double r) {}	 
	 */

	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
