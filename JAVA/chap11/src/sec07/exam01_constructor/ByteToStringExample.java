package sec07.exam01_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		// byte 데이터타입으로 연속된 기억장소를 생성하고 하나의 이름으로 관리하는 의미 : 배열
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // " Hello java "
		
		// byte -> string 변환
		String str1 = new String(bytes);
		System.out.println(str1); // hello java
		
		String str2 = new String(bytes, 6, 4); // 6번째 인덱스부터 4개를 불러와라
		System.out.println(str2); // 결과 java

	}

}
