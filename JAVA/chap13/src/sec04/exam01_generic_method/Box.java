package sec04.exam01_generic_method;

// 제네릭 클래스
// <T> : Integer
public class Box<T> {
	private T t;  // 필드  Integer t;
	public T get() { return t;} //  Integer get(); 
	public void set(T t) {this.t = t;} // set(Integer t)
}
