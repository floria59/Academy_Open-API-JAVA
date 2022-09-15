package sec08.exam01_abstract_class;

// 추상클래스는 상속을 위한 목적.
public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
