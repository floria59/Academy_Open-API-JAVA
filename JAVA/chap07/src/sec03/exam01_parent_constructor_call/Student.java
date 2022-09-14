package sec03.exam01_parent_constructor_call;


public class Student extends People {

	public int studentNo;
	
	//부모클래스의 기본생성자가 없고, 수동으로 매개변수가 있는 생성자메서드가 존재하기 때문에
	// 자식클래스 입장에서, 매개변수가 있는 부모클래스의 생성자를 호출시, 기본생성자로 불가능한 상태이기 때문에.
	//부모클래스가 기본생성자는 없고, 매개변수가 있는 생성자를 가지고 있을 경우에는
	//자식클래스는 매개변수가 있는 부모생성자를 호출하기위하여, 매개변수가 같은 생성자를 가지고 있어야 한다.
	
	//기본생성자 자동생성
//	Student() {
//		super();
//	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모클래스의 생성자메서드 호출
		this.name = name;
		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	
	
	
	

	
	
	
}
