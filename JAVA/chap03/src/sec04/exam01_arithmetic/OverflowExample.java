package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		
		
		// 정수데이타타입은 값이 오버되면, 앞으로 로테이트가 되어, 결과를 갖게된다.(쓰레기값)
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);

	}

}
