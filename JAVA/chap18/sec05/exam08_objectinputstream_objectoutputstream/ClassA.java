package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

//객체 직렬화로 사용할 클래스는 Serializable 인터페이스를 구현해야 한다.
public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	
	static int field3; //직렬화 대상에서 제외
	transient int field4; //직렬화 대상에서 제외
}
