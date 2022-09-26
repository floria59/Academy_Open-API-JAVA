package sec04.exam01_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		//user1,user2 작업스레드에서 사용할 공유자원객체 생성
		Calculator calculator = new Calculator();
		
		/*
		  Calculator calculator1 = new Calculator();
		  Calculator calculator2 = new Calculator();
		 */
		
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); // 실행대기상태 등록
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
