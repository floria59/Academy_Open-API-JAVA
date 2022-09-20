package sec03.exam05_deep_clone;

import java.util.Arrays;

// 객체복사가 되기위한 클래스는 조건이 있다.
// Cloneable 인터페이스를 구현한 클래스 이어야 한다.
public class Member /*  extends Object */ implements Cloneable {

	//필드 : 기본타입과 참조타입을 구분해서 확인
	
	public String name;
	public int age;
	
	// 참조타입 2개는 clone()복사에 의하여, 주소만 공유되는 필드가 2개 만들어진다.
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super(); // 생략해도 컴파일과정에서 부모생성자를 호출하는 이 코드는 자동생성됨.
		this.name = name;
		this.age = age;
		// 주소
		this.scores = scores;
		this.car = car;
	}

    // 얕은복사 -> 깊은복사
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Member cloned = (Member) super.clone(); // 얕은복사. 참조타입의 필드는 주소만 공유.
		
		// 새로운 기억장소

		
		// 이전에는 공유된 주소를 가지고 있었음.
		//새로운 배열생성
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//새로운 Car클래스 객체생성
		cloned.car = new Car(this.car.model);
	
		return cloned;
	}
	
	
	
}
