package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		// 문자열은 비교시 대소문자를 구분한다.
		System.out.println(str1.equals(str2)); // false
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		//대소문자 무시하고 비교.
		System.out.println(str1.equalsIgnoreCase(str2)); // true

	}

}
