package sec04.exam02_local_variable;

/*
함수적 인터페이스 : 추상메소드 1개만을 구성요소로 하는 인터페이스. 목적? 람다식문법을 사용
*/
@FunctionalInterface // @명령어 : 어노테이션.  인터페이스에서 추상메소드를 반드시 1개만 사용가능.
// 추상메소드를 더 추가시 문법적으로 에러발생.

public interface MyFunctionalInterface {
	//매개변수 없고, 리턴타입 없는 형태. -> 람다식구문표현
	public void method();

}
