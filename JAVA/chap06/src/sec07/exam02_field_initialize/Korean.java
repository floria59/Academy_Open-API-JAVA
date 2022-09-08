package sec07.exam02_field_initialize;

public class Korean {
	
	//필드
	String nation = "대한민국";
	String name; 				// 기본값 null
	String ssn; 				// 기본값 null

	//생성자 수동정의 : 힙영역에 생선된 기억장소의 값을 초기화.
	/*public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}
	*/
	
	// 다른이름 쓰지말고 직관적으로 쓰자 , 가. 독. 성 중시
	public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn;
	}
}

