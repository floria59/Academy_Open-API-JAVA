package sec03.exam02_arguments;

public class MyMethodReferencesExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// public void method(int x); 추상메소드 구현작업. 타입추론이 지원됨.
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(2);
		
		// 매개변수가 1개일 경우에는 () 를 생략가능
		fi = x -> System.out.println(x*5);
		fi.method(2);

	}

}
