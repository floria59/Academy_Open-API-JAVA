package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		int length = ssn.length();
		if(length == 14) {
			System.out.println("주민번호가 맞음");
		}else {
			System.out.println("주민번호가 틀림");
		}

	}

}
