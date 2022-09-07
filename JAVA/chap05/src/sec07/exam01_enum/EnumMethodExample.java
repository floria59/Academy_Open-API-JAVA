package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		String name = today.name(); // 열거상수를 문자열로 반환
		System.out.println(name); // "SUNDAY" 그대로 출력
		
		// 순번확인
		int ordinal = today.ordinal(); // 순번(서수)를 반환
		System.out.println(ordinal); // 6
		
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; //2

		int result1 = day1.compareTo(day2); // 0 - 2 = -2
		int result2 = day2.compareTo(day1); // 2 - 0 = 2
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		if(args.length == 1) {
			String strDay = args[0]; // 텍스트. String
			// 문자열을 Week열거형 데이터타입으로 변환하는 구문.
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말입니다.");
			}
			else {
				System.out.println("평일입니다.");
			}
			
		}
		
		Week[] days = Week.values();
			for (Week day : days) {
				System.out.println(day);
			}
	}

}
