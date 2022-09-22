package sec07.exam02_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123"; // 1, 2, 3, 4
		char sex = ssn.charAt(7); //8번째 문자
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}

	}

}
