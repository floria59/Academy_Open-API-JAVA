package sec08.exam02_abstract_method;

// 공통되는 필드와 메소드를 구성요소. 추상메서드 구성.
public abstract class Animal {

	//필드
	public String kind;
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 작업시 abstract 키워드 사용. 정책명은 있으나 세부내용이 없는 것과 같은 의미로 바라본다.
	public abstract void sound(); //추상메소드.  메소드 선언부만 존재하고, 실행부는 제외.  {}포함
}
