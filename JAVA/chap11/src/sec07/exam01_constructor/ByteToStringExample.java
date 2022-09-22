package sec07.exam01_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte데이타타입으로 연속된 기억장소를 생성하고 하나의 이름으로 관리하는 의미 : 배열
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};  // "Hello Java"
		
		//byte->String변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2); // "Java"

	}

}
