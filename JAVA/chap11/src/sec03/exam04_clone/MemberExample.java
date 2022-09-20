package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		
		//원본객체생성
		Member original = new Member("blue", "홍길동", "12345", 25, true); 
		
		Member cloned = original.getMember();
		cloned.password = "67890"; // "67890"문자열 데이타의 기억장소에 새로 생성되고, 그곳의 주소가 대입된다.
		
		//String클래스의 참조타입
		System.out.println("원본값: " + original.password + " : " + "복제값: " + cloned.password);
		
		//기본타입
		System.out.println("원본값: " + original.age + " : " + "복제값: " + cloned.age);

	}

}
