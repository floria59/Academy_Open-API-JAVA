package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		// 소수부분을 무조건 올림.
		double v3 = Math.ceil(5.3); //올림함수.
		double v4 = Math.ceil(-5.3); //올림함수.
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
		// 소수부분을 무조건 내림
		double v5 = Math.floor(5.3); //내림함수
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);
		
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);
		
		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);
		
		//랜덤값 : 0.0이상에서 1.0미만의 실수값을 무작위로 뽑는 기능
		double v11 = Math.random();
		System.out.println("v11=" + v11);
		
		//가장 가까운 정수값 구하기
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12=" + v12);
		System.out.println("v13=" + v13);
		
		//반올림함수.  소수부분이 5이상이면 올림처리, 5미만이면 내림처리.
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14=" + v14);
		System.out.println("v15=" + v15);
		
		//이클립스 단축키 목록 : CTRL + SHIFT + L
		
		
		
		
		
		
	}

}
