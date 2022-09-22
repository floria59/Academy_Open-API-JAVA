package sec07.exam02_method;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "    12    34   ";
		
		//좌우측 공백제거. 참고로 가운데는 제거 못한다.
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
