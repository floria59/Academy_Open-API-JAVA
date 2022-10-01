package sec03.exam03_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y; // 한줄 {}중괄호 생략. return 키워드 생략
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));

	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}
