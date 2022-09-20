package sec03.exam05_deep_clone;

public class MemberExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		Member obj2 = null;
		
		try {
			obj2 = (Member) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("원본값: " + obj1.scores[0] + " : " + "사본값: " + obj2.scores[0]);
		
		obj1.scores[0] = 100;
		
		System.out.println("사본값: " + obj2.scores[0]);

	}

}
