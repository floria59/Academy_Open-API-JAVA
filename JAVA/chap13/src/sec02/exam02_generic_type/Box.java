package sec02.exam02_generic_type;

// 제네릭 클래스
public class Box<T> {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}
