package sec02.exam01_none_generic_type;

// Object클래스 : 최상위 클래스.
// 모든 데이타타입을 자식으로 관리하는 특징.
// 형변환? 성능부하
public class Box {
	public Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
