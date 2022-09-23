package sec16.exam01_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		
		//날짜정보
		LocalDate currDate = LocalDate.now(); // 시스템의 현재 날짜.
		System.out.println("현재 날짜: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2023, 1, 2);
		System.out.println("수료 날짜: " + targetDate + "\n");
		
		//시간정보
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간: " + targetTime);
		
		//날짜와시간정보 
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와시간: " + currDateTime + "\n");
		
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 1, 2, 13, 50, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime);
		
		//협정 세계시와 시간존(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간존: " + seoulDateTime);
		
		// Date클래스와 유사한 성격.
		// Date클래스 : 시스템의 로컬시간정보
		// Instant클래스 : 세계협정표준시(UTC)를 기준. 1970년1월1일 0시0분0초~ 0으로 시작해서 코드가 실행된 시간까지를 체크
		// 특정한 두 시점의 시간적 우선순위를 확인하고자 할때 사용
		
		
		Instant instant1 = Instant.now();
		Thread.sleep(10); // 0.01 초 시간만큼 일시정지
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다."); // 앞시간
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		
		// instant1와instant2 의 두정보의 시간차이를 나노초(NANO)로 계산
		System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));

	}

}
