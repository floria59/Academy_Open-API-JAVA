package sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 참조타입 : 클래스, 배열, 열거(Enum), 인터페이스
		// 참조타입의 기본값 : null
		
		Week today = null;
		
		// 패키지이름. 구성요소이름
		// 패키지 생략하는 방법. import명령어 사용
		// java.util.Calendar - > Calendar로 단독사용
		
		// 참조타입
		// 사용법 1) 클래스명 변수 = new 클래스명(); (대표적임)
		// 사용법 2) 클래스명 변수 = 클래스명, 메서드();
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 4
		
		switch(week) {
			case 1 :
				today = Week.SUNDAY;
			break;
			
			case 2 :
				today = Week.MONDAY;
				
			case 3 :
				today = Week.TUESDAY;
			break;
			
			case 4 :
				today = Week.WEDNESDAY;
			break;
			
			case 5 :
				today = Week.THURSDAY;
			break;
			
			case 6 :
				today = Week.FRIDAY;
			break;
			
			case 7 :
				today = Week.SATURDAY;
			break;
		
		}
		
		System.out.println("오늘 요일 :" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 복습을 한다.");
		}
		else {
			System.out.println("좀비코딩 열심히 자바공부하자,,");
		}
		
		
	}

}
