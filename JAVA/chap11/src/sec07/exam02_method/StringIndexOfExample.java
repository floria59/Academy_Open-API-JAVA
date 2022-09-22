package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		// 일치되는 검색어에 첫문자 인덱스를 반환한다.
		int location = subject.indexOf("프로그래밍"); //3
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련없는 책입니다.");
		}

	}

}
