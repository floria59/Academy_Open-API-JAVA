package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		
		// new 뒤에는 생성자 메서드만 와야하는 규칙이 있다 !!
		
		// 객체생성 . 인스턴스
		Korean k1 = new Korean("홍길동", "123456-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("홍길금", "654321-7654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}

