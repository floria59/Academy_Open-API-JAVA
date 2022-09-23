package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date(); //시스템의 현재날짜,시간정보를 참조.
		String strNow1 = now.toString();
		System.out.println(strNow1); // Thu Sep 22 11:20:57 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2); // 2022년 09월 22일 11시 24분 51초

	}

}
