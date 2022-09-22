package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// String클래스는 새로운 문자열이 생성이 될때마다 새로운기억장소를 생성한다. 메모리및성능문제가 될수가 있다.
		//StringBuilder, StringBuffer 클래스를 사용하면, 객체가 생성시 힙영역의 기억장소를 재사용한다.
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); // 5번째위치에 '2'문자를 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6'); // 5번째위치에 데이타를 '6'문자로 변경.
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
