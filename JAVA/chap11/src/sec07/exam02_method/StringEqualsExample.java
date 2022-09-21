package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = new String("홍길동");
		
		// 홍길동 문자열을 사용 한 후에는 주소 공유가 이루어진다. 
		String strVar2 = "홍길동";
		String strVar3 = "홍길동";
		
		// 문자열 비교연산자 == 의 의미는 주소비교임, 숫자인 경우는 값 자체 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		// 문자열 데이터비교
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//strVar3 ="이순신"; // 이순신 문자열이라는 데이터의 새로운 기억장소가 생성되고, 주소가 대입된다. 
		
		if(strVar2 == strVar3) {
			System.out.println("홍길동 문자열이 저장된 주소를 공유한다.");
		}
		
	}

}
