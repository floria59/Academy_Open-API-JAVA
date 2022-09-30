package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 자동형변환 발생.   작은데이타타입을 큰데이터타입으로 대입시 자동형변환 
		String name = (String) box.get(); // 명시적형변환.   큰데이터타입을 작은데이터타입으로 대입시는 명시적형변환
		
		box.set(new Apple()); // Apple -> Object 자동형변환
		Apple apple = (Apple) box.get(); // 명시적 형변환

	}

}
