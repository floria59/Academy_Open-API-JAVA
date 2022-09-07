package sec06.exam04_main_agrument;

public class MainStringArrayArgument {

	// main메서드의 매개변수 사용 : run메뉴 -  configuration - Argument에 10, 20 작성 후 run
	public static void main(String[] args) {
		
		
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java.exe MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 종료
			
		}
		
		// System.out.println("테스트");
		
		String strNum1 = args[0];
		String strNum2 = args[1];

		// 문자열을 int로 변환하는 구문.
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
