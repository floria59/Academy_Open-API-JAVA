package sec06.stream_sorting;

//클래스가 대소비교를 할 경우에 인터페이스를 구현해야 한다.
public class Student implements Comparable<Student>  {

	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	
	
	// 재정의하는 메소드에 정렬에 대한 비교내용을 담아야 한다.
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(score, o.score);
	}
	

}
