package sec10.exam01_static_member;

public class Calculator {

	//(instance)인스턴스멤버와 static(정적)멤버
	
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	//인스턴스 멤버필드
	int multiply(int x, int y) {
		return x * y;
	}
}
