package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Boxing : 기본데이타 타입의 값이 힙영역의 메모리에 객체로 관리되기 위하여 저장. 
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");  // 100 -> "100" -> 객체로 관리.
		Integer obj3 = Integer.valueOf("300");
		
		//Unboxing : 힙영역장소에서 데이타를 읽어와서 스택영역 저장.
		int value1 = obj1.intValue(); // 객체관리 -> 100
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}

