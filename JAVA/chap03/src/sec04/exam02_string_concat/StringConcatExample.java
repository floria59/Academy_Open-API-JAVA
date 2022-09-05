package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		
		//문자열 데이타를 저장하는 기억장소.  String클래스
		// + : 연결연산자.  문자열과 사용하면, 숫자데이터를 "숫자" 문자열로 변환이 일어난다.
		String str1 = "JDK" + 6.0; // "JDK" + "6.0" => "JDK6.0"
		String str2 = str1 + " 특징"; // "JDK6.0" + " 특징" => "JDK6.0 특징"
		System.out.println(str2);
		
		// () 가로 사용하여 먼저 처리하면 문제가 되지 않는다.
		String str3 = "JDK" + 3 + 3.0; // "JDK33.0"
		String str4 = 3 + 3.0 + "JDK"; // "6.0JDK"
		System.out.println(str3);
		System.out.println(str4);
	}

}
