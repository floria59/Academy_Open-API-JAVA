package sec03.try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) /*throws ClassNotFoundException */ {
		
		//java.lang패키지에는 String2 클래스가 존재하지 않는다.
		// 메서드는 문법적으로 예외처리 관련문법을 반드시 작성해야 하는 규칙을 가지고 있다.
		// 예외관련문법 1)예외전가(상위 개념에게 넘기는 의미) 2)예외처리구문 : 자신이 처리하는 의미.
			try {
				Class clazz = Class.forName("java.lang.String2");
			} catch (ClassNotFoundException e) {
				System.out.println("클래스가 존재 안함.");
			}
		

	}

}
