package sec04.exam01_field;

public class UsingThisExample {

	public static void main(String[] args) {
		//외부클래스 객체생성
		UsingThis usingThis = new UsingThis();
		//중첩클래스 객체생성
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}
