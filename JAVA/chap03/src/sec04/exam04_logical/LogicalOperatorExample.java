package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// byte -> short(char) -> int -> long
		//int형 변수에 char데이터를 저장.
		// 묵시적형변환(자동형변환)     (데이타타입) 변수
		int charCode = '0'; // 우측의 값은 좌측의 변수에 해당하는 타입으로 형변환.
		
		
		// & 한개.   && 두개
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자이다.");
		}
		
		/*
		 and(&&) : 2개의 입력조건이 true이었을 때 결과가 true이다.
		           2개의 입력조건중 한개가 false이면, false이다.  
		                                       값1        값2         결과
		                    true  true   true
		                    true  false  false
		                    false true   false
		                    false false  false
		 * 
		 */
		// &&
		// 첫번째 조건이 false이면, 두번째 조건은 진행되지 않는다.
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자이다.");
		}
		
		//숫자인지 체크.
		// & 첫번째 조건, 두번째 조건을 모두 실행한다.
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("숫자이다.");
		}
		
		// 
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("숫자이다.");
		}
		
		/*
		 or ( |, || ) 
		 
		  값1     값2       결과
		 true true  true
		 true false true
		 false true true
		 false false false
		  
		 */
		
		
		// | 한개 : 첫번째, 두번재 조건을 모두 확인하다.
		// || 두개 : 첫번째 조건이 true이면, 두번째조건은 진행하지 않는다.
		
		int value = 6;
		
		// 첫번째, 두번째 조건을 모두 진행한다.
		if( (value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수이다.");
		}
		
		// 첫번째 조건이 true이면, 두번째 조건은 진행 안한다.
		if( (value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수이다.");
		}
		
		

	}

}
