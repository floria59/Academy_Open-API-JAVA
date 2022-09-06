package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		// 기본타입
		// 스택영역에 int형 기억장소 a가 존재하고 100 이 들어 있다.
		//int a = 100;
		
		// 참조타입
		// strVar1 변수에  힙영역에 저장되어 있는 "홍길동" 문자열데이타의 기억장소 주소가 존재.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동"; // 힙영역에 새로 기억장소를 생성하지 않고, 앞의 홍길동 데이타 주소사용
		
		//주소비교.  실제데이타 비교가 아니다.(중요)
		if(strVar1 == strVar2) {
			System.out.println("strVar1과strVar2 참조가 같다.");
		}else {
			System.out.println("strVar1과strVar2 참조가 다름.");
		}
		
		//값비교.
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과strVar2는 문자열 데이타 같음.");
		}
		
		// 힙영역에 "홍길동" 데이타의 기억장소가 각각 생성된다. 주소가 다르다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		//주소비교
		if(strVar3 == strVar4) {
			System.out.println("strVar3과strVar4 참조가 같다.");
		}else {
			System.out.println("strVar3과strVar4 참조가 다름.");
		}
		
		//값비교.
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과strVar4는 문자열 데이타 같음.");
		}

	}

}
