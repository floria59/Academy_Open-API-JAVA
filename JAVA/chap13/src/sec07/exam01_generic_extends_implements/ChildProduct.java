package sec07.exam01_generic_extends_implements;

//제네릭 부모클래스 상속시 자식클래스는 부모의 타입파라미터를 반드시 사용해야 한다. 추가도 할수있다.
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;  // String company;
	public C getCompany() { return this.company; }   // String getCompany()
	public void setCompany(C company) { this.company = company;} // setCompany(String company)
}
