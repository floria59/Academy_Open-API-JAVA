package sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0-5.  인덱스6을 제외한다.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 인덱스7부터 모두 가져온다.
		System.out.println(secondNum);

	}

}
