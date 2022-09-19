package sec03.try_catch_finally;

public class NullPointerExceptionTryCatchExample {

	public static void main(String[] args) {

		String data = null;
//		data = "홍길동";
		
		//예외처리구문
		try {
		
			System.out.println(data.toString()); //발생된 오류데이타가 NullPointerException클래스에 해당된다.
		}catch(Exception ex) {
			System.out.println("예외 처리구문");
			ex.printStackTrace(); // 예외관련 메세지 출력.
		}
		
		System.out.println("프로그램 종료");

	}

}
