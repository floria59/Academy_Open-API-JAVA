package sec10.exam02_static_block;

public class Television {

	//정적멤버 : 공용데이타
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//static 생성자메서드는 존재하지 않는다. 인스턴스멤버를 초기화목적으로 사용하기 때문에
	static {
		info = company + "-" + model;
	}
	
}
