package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요"; // 한글자를 3바이트로 처리.
		
		//문자열 -> byte[] 변환
		byte[] bytes1 = str.getBytes(); // 자바는 기본인코딩방식이 "UTF-8"
		System.out.println("bytes1.length: " + bytes1.length); // 15
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		//예외처리구문
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR"); // 한글자를 2바이트로 처리.
			System.out.println("bytes2.length: " + bytes2.length); // 10
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
