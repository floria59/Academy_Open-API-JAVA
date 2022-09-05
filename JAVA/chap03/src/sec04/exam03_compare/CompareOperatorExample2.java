package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		// 타입일치. v2가 v3변수의 double형변환된다. 그리고 비교가 이루어진다.
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		// v5변수가 double형으로 변환이 이루어진다. 실수값 표현하는 방식의 오차로 인한 문제로 같지않다.
		System.out.println(v4 == v5); // false
		
		// v4 double형 변수를 float형으로 변환한 후 비교는 값의 문제가 발생되지않는다.
		System.out.println((float)v4 == v5); // true
		
		// 사과예제와 같은 사례.
		System.out.println((int)(v4*10) == (int)(v5*10)); // true
				

	}

}
