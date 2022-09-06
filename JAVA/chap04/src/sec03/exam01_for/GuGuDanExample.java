package sec03.exam01_for;

public class GuGuDanExample {

	public static void main(String[] args) {

		//구구단예제
		
		for(int gop = 0; gop <= 9; gop++) {
			for(int dan = 2; dan <= 9; dan++) {
				//제목행을 출력하는 구문.(단 1번)
				if(gop == 0) {
					System.out.print(dan + "단" + "\t");
					continue;
				}
				
				// 데이타행을 출력하는 구문.
				System.out.print(dan + "*" + gop + "=" + (dan*gop) + "\t");
			}
			System.out.println(); // 웹페이지에 출력하는 기능은 없다.
		}

	}

}
