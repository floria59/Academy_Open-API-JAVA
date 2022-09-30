package sec04.exam01_generic_method;

public class Util {
	
	/*
	제네릭 메소드 문법구성
	public static <타입파라미터> 리턴타입 메소드명(타입 매개변수) {
	
	 return 변수;
	}
	
	일반메소드 문법구성
	public static 리턴타입 메소드명(타입 매개변수) {
	
	
	  return 변수;
	}
	
	*/
	
	
	//제네릭 메소드 정의 : 메소드에 타입파라미터 작업.
	//메소드의 리턴타입 또는 매개변수에 사용하고자 하는 타입을 지정.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
