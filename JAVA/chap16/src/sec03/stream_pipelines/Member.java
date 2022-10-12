package sec03.stream_pipelines;

public class Member {

	public static int MALE = 0; // public static final int MALE = 0; (상수)
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//Getter메소드
	public int getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	
	
}
