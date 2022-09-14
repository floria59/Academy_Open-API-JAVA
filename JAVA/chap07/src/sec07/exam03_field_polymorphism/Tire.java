package sec07.exam03_field_polymorphism;

// 바퀴클래스 : 표준(규격)
public class Tire {

	//필드
	public int maxRotation; //최대회전수(최대수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치
	
	
	//생성자
	public Tire(String location, int maxRotation ) {
		//super(); 생략가능.
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 평크 ***");
			return false;
		}
	}
}
