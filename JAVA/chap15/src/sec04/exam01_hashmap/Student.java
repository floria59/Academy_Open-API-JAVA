package sec04.exam01_hashmap;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 동등객체로 비교하기위한 메소드 재정의
	//첫번째 비교사용
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

	//두번째 비교사용
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
}
