package sec04.exam02_local_variable;

public class UsingLocalVariable {

	//필드
		
	void method(int arg) {
		int localVar = 40;
		
		//람다식에서 사용하지 않으면, 새로운 값 대입이 가능하다.
		//arg = 31;
		//localVar = 10;
		
		//람다식에서 매개변수및 지역변수를 사용시에는 final특성을 가지게 된다.
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		
		fi.method();
	}
}
