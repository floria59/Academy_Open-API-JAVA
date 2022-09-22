package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("홍길동");
		
		// "홍길동" 문자열을 사용 한 후에는 주소 공유가 된다.
		String strVar2 = "홍길동";
		String strVar3 = "홍길동";
		
		// 문자열 비교연산자(==)의 의미는 주소비교이다.  숫자일 경우에는 값 자체비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//문자열 데이타비교
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		// "이순신" 문자열 데이타의 새로운 기억장소가 생성이되고, 주소가 대입된다.
		//strVar3 = "이순신"; 
		
		if(strVar2 == strVar3) {
			System.out.println("홍길동 문자열 저장된 주소를 공유한다.");
		}

	}

}
