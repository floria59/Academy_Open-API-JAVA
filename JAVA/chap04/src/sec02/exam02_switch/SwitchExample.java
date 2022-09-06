package sec02.exam02_switch;

public class SwitchExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		// 변수의 데이타타입이 정수형데이타타입, 문자열, 열거형...
		switch(grade) {
			case 'A': 
			case 'a': 
				System.out.println("우수회원");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원");
				break;
			default:
				System.out.println("손님");
				
		}

	}

}
