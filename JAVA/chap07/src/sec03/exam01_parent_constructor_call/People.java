package sec03.exam01_parent_constructor_call;

public class People {

	public String name;
	public String ssn;
	
	
	// 매개변수가 있는 생성자메서드가 존재하면, 기본생성자는 컴파일시 자동생성 안된다.
	//People() {}
	
	// 매개변수가 존재하는 생성자메서드 1개
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
