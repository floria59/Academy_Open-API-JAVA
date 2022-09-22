package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Byte.MAX_VALUE);
		
		
		//박싱과 언박싱에 의하여 객체를 대상으로 값비교가 발생시 문제가 나타나므로 , ==, != 정상적인 비교를 할수가 없다.
		// 대안? 언방싱하여 값을 비교하거나 equals()메소드로 내부의 값을 비교하는 기능을 이용하라.
		
		
		System.out.println("[-128~127 범위를 초과한 값]");
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2)); //값비교 false. 사용하지 말것
		System.out.println("언박싱 == 결과" + (obj1.intValue() == obj2.intValue())); // 값비교 true. 대안
		System.out.println(obj1.equals(obj2)); // 값비교 재정의. true. 대안
		
		
		System.out.println("[-128~127 범위의 값]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4)); //값비교 true. 사용하지 말것
		System.out.println("언박싱 == 결과" + (obj3.intValue() == obj4.intValue())); // 값비교 true. 대안
		System.out.println(obj3.equals(obj4)); // 값비교 재정의. true. 대안

	}

}
