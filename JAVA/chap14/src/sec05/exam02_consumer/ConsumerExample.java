package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	//함수적 인터페이스 : 람다식 문법을 이용하여 구현가능한 특징. 1개의 추상메소드 가질수 있다.
	public static void main(String[] args) {
		// Consumer함수적 인터페이스 : 객체를 소비목적.
		// 매개변수가 제공되고, 리턴값이 없는 특징.
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);

	}

}
