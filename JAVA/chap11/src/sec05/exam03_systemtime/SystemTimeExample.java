package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {
		
		// 1970.1.1 0:00:00~  현재시점까지의 기록된 시간을 밀리세컨드 단위로 표시.
//		long time = System.currentTimeMillis();
		
		//System.out.println(time);
		
		long time1 = System.nanoTime(); //작업전  시간체크
		
		//작업내용.
		int sum = 0;
		for(int i=1; i<=1000000;i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime(); //작업후 시간체크
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산소요시간: " + (time2-time1) + " 나노초가 소요되었습니다.");


	}

}
