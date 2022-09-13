package sec10.exam04_singleton;

//디자인패턴중 하나인 싱글톤 패턴으로 설계한 클래스.
//  특징? 하나의 클래스로 객체를 단 한번만 생성하도록 클래스를 설계.
public class Singleton {

	// private : 외부에서 접근을 막는 기능.
	
	//1)자신의 객체를 내부의 필드(private)로 생성
	private static Singleton singleton = new Singleton();
	
	//2)생성자(private)
	private Singleton() {}
	
	// 3)생성된 자신의 객체를 참조하는 메서드정의.. 접근자 생략시 default
	static Singleton getInstance() {
		return singleton;
	}
}
