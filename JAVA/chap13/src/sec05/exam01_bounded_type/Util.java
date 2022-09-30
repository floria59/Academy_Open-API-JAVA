package sec05.exam01_bounded_type;

// Number 추상클래스 : Byte, Short, Integer, Long클래스의 상위클래스
public class Util {
	// T extends Number : Number클래스 이거나 Number클래스를 상속, 구현한 클래스만 사용가능. (상위타입 제한)
	// T extends 인터페이스 : implements 키워드 사용안함.
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
