package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

//부모클래스가 Serializable를 구현하고 있으면, 자식클래스가 Serializable 구현하고 있지않아도 부모,자식 모두 직렬화작업이 된다.
/*
 class 부모클래스 implements Serializable{}
 class 자식클래스 extends 부모클래스 {}
  
 */


//반대로 부모클래스가 Serializable를 구현이 안되어있고, 자식클래스가 Serializable 구현되어 있으면, 자식만 직렬화작업이 된다.(부모는 직렬화 제외)
/*
 class 부모클래스 {}
 class 자식클래스 extends 부모클래스 implements Serializable {}
 */
public class Parent {
	public String field1;
}
