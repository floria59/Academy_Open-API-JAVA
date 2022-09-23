package sec14.exam02_calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		//대부분의 클래스는 필드의 값을 변경목적 : Setter메소드
		//          값을 읽어오는 목적 : Getter메소드가 존재한다.
		
		//추상클래스 : 상속목적, 객체생성 불가능.
		Calendar now = Calendar.getInstance();
		
		//모든 날짜및시간 필드정보를 확인이 가능함.
		System.out.println("현재날짜: " + now.toString());
		
		int year = now.get(Calendar.YEAR); //년도
		int month = now.get(Calendar.MONTH) + 1; //월.  0~11범위
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		
		int week = now.get(Calendar.DAY_OF_WEEK); //요일
		
		//System.out.println(week);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			default:
				strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM); //오전,오후를 나타내는 정보
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
		
		

	}

}
