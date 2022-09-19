package sec03.try_catch_finally;

public class NullpointerExceptionExample {

	public static void main(String[] args) {
		
		String data = null;
		
		// 예외 처리 구문
		try {
			System.out.println(data.toString());
		}
		catch(NullPointerException ex) {
			
		}
		
		System.out.println("프로그램 종료");

	}

}
