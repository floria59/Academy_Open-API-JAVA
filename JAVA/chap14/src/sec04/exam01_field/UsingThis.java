package sec04.exam01_field;

//람다식 구문에서 클래스의 멤버를 제약없이 사용가능.
public class UsingThis {

	public int outterField = 10;
	
	//중첩클래스
	class Inner {
		int innerField = 20;
		
		void method( ) {
			//람다식문법으로 구현
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			};
			
			fi.method();
		}
	}
}
