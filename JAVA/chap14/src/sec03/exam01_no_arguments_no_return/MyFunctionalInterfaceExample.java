package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		//익명구현객체
		/*
		MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
			
			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
				
			}
		};
		*/
		
		//람다식문법 : 익명구현객체의 내용을 람다식구문.
		//익명함수.   일반적인 함수형태 :   리턴타입 메소드명(매개변수,....) {............}
		MyFunctionalInterface fi;
		
		// public void method(); 추상메소드를 구현한 의미.
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// 중괄호 {} 안에 명령문이 하나인 경우에는 {} 생략가능
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
		//클래스를 구현한 형태.
		MyFunctionalInterface fi2 = new MyFunctionInterfaceImpl();
		fi2.method();
		
		

	}

}
