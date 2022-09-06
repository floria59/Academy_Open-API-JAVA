package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {

		// Math클래스 : 수학관련기능을 제공하는 클래스.
		// 0.0 이상~ 20.0미만  -> 0이상에서  20미만  -> 81이상에서 101미만
		//System.out.println((int)(Math.random() * 20) + 81);
		
		// 80이상100이하의 점수가 랜덤으로 생성. 특정범위의 값을 추출
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);

	}

}
