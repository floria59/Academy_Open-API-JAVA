package sec04.exam01_arithmetic;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;  // Infinity 키워드가 예약된 실수값사용. 0
		//z = x % y; // NaN. 키워드가 예약된 실수값사용. 주석을 선택적 사용
		
		System.out.println(z); 
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

	}

}
