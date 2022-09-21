package sec07.exam02_method;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 문자열 -> byte[ ] 변환
		byte[ ] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);

	}

}
