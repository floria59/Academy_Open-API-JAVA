package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// Scope(스코프) : 범위
		// 변수선언 위치에 따라서 변수가 인식이 되고 안되는 특징이 있다.
		
		int var1;
		
		// if문안에서 선언된 변수는 다른 위치에서는 사용이 불가능.
		if(true) {
			
			int var2;
			var2 = 10;
			
			//System.out.println(var2);
			var1 = 20;
		}
		
		// System.out.println(var2);
		System.out.println(var1);

	}

}
