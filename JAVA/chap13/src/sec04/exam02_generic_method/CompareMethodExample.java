package sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
		//명시적 타입파라미터 사용
		boolean result1 = Util.<Integer, String>compare(p1, p2); 
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		
		// 타입파라미터 사용생략. (매개변수의 데이터를 보고 타입추정)
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		
		// Pair 제네릭 클래스는 타입파라미터에 어떤 타입이든 모두 사용이 가능한 상태.
		// 아래 구문은 모든 데이타타입이 사용가능한 의미로 작성.
		Pair<Double, String> p5 = new Pair<Double, String>(10.5, "테스트");
		Pair<String, String> p6 = new Pair<String, String>("테스트", "테스트");
		Pair<String, Double> p7 = new Pair<String, Double>("테스트", 10.5);
		
	}

}
