package sec08.exam01_split_stringrokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String text = "감자깡/양파깡/고구마깡";
		
		// 분리된 문자열데이터를 배열로 지원안함 !
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		
		System.out.println("토큰 수 : " + countTokens);

		
		for(int i = 0; i <countTokens; i++) {
			String token = st.nextToken(); // 토큰 데이터를 꺼내온다.
			System.out.println(token);
		}
		
		System.out.println("토큰 수 : " +st.countTokens());
		
		st = new StringTokenizer(text, "/"); // 데이터를 새로구성
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
