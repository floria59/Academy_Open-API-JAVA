package sec15.exam01_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "java";
		String name = "홍길동";
		String tel = "010-555-5555";
		
		// + : 문자열 연결연산자 작업이 불편.
		String text = "회원 ID: {0} \n회원이름: {1} \n회원 전화: {2}"; 
		Object[] arguments = {"java", "홍길동", "010-555-5555"};
		String result1 = MessageFormat.format(text, id, name, tel);
		String result2 = MessageFormat.format(text, arguments);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();

	}

}
