package sec02.exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {

		int score = 75;
		
		// 첫번째 조건식에서부터 상위조건을 적용해야 다음 조건식들은 순차적으로 해야 한다.
		if(score >= 90) {
			System.out.println("등급 A");
		}else if(score >= 80) {
			System.out.println("등급 B");
		}else if(score >= 70) {
			System.out.println("등급 C");
		}else {
			System.out.println("등급 D");
		}

	}

}
