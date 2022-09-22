package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동/이수홍/박연수";
		
		// 분리된 문자열데이타를 배열로 지원안한다.
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		
		System.out.println("토큰수 :" + st.countTokens());
		
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken(); // 토큰데이타를 꺼내온다.
			System.out.println(token);
		}
		
		System.out.println("토큰수 :" + st.countTokens());
		
		st = new StringTokenizer(text, "/"); // 데이타를 새로구성
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
