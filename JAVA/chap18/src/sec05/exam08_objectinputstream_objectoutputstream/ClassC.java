package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

// serialVersionUID 자동생성. 
// 클래스가 변경될때마다 값이 변경해서 역직렬화 작업시 에러발생한다.
// 그래서, serialVersionUID 필드와 값을 수동으로 처리하면, 클래스 변경되더라도 역직렬화 작업에 에러를 막을수 있다.
public class ClassC implements Serializable {
	int field1;
	int field2;
	int field3; //추가
	
	private static final long serialVersionUID = 1;
}
