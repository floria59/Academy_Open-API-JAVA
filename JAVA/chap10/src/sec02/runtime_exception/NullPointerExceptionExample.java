package sec02.runtime_exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		String data = null;
		
		System.out.println(data.toString()); //발생된 오류데이타가 NullPointerException클래스에 해당된다.
		
		System.out.println("프로그램 종료");

	}

}
