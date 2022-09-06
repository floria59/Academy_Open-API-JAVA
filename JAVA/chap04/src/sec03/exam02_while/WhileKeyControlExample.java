package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {

		
		boolean run = true;
		int speed = 0; // 속도
		int keyCode = 0;  // 기계작동 코드값
		
		while(run) {
			// 키보드의 엔터키를 사용하게되면, 아스키코드값이 13,10
			if(keyCode!= 13 && keyCode != 10) {
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.print("선택: ");
			}
			
			// System.in.read(); 콘솔환경에서 키보드 입력을 받아 진행하는 명령어
			keyCode = System.in.read();
			
			if(keyCode == 49) {  // 키보드에서 1을 입력시 아스키코드값
				speed++;
				System.out.println("현재 속도= " + speed);
			}else if(keyCode == 50) { // 키보드에서 2을 입력시 아스키코드값
				speed--;
				System.out.println("현재 속도= " + speed);
			}else if(keyCode == 51) { // 키보드에서 3을 입력시 아스키코드값
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
