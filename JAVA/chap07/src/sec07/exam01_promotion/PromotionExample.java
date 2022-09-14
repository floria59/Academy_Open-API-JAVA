package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//형변환(Casting). = 연산자는 작동시 타입일치
		// 상속관계가 직계일 경우
		A a1 = b; // 자동형병환
		A a2 = c; // 자동형변환
		A a3 = d; // 자동형변환
		A a4 = e;// 자동형변환
		
		B b1 = d; // 자동형변환
		C c1 = e;  // 자동형변환
		
		//직계가 아니면 형변환 작업이 불가능.
		//B b3 = e;
		//C c2 = d;

	}

}
