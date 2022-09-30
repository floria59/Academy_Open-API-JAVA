package sec04.exam02_generic_method;

public class Util {
	//제너릭 메소드 정의 : 다양한 데이타타입들을 사용하고 싶은 경우.
	// 비교목적 : 하나의 데이타타입에 해당하는 의미만 비교목적으로 사용했었는데
	// 제너릭인 경우에는 여러 데이타타입들 비교목적으로 사용가능하다.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
}
