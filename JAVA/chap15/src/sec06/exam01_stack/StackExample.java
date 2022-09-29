package sec06.exam01_stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		//스택 자료구조를 반영한 클래스. LIFO 구조(후입선출)
		// 예> JVM 스택영역, 웹브라우저 이전/다음 버튼
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 데이타를 꺼내오고, 스택구조에서는 제거.
			System.out.println("꺼내온 동전 : "  + coin.getValue() + "원");
		}

	}

}
