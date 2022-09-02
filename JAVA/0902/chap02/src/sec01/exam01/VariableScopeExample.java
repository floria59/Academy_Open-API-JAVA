package sec01.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		// Scope(스코프) : 범위
		// 변수선언 위치에 따라서 변수가 인식되고 안되는 특징을 갖는다.
		
		int var1;
		
		// if문 안에서 선언된 변수는 다른 위치에서 사용 불가능
		if(true) {
			
			int var2;
			var2 = 10;
			
			var1 = 20;
			
			// 괄호안에서 작성해야 var2의 값을 출력할수있다.
			System.out.println(var2);
			
		}
		
		System.out.println(var1);
	}

}
