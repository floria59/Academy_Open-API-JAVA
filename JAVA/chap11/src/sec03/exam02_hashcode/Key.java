package sec03.exam02_hashcode;

// 객체비교 : 중요.


//객체비교의 동작메커니즘.(자바에서 객체가 동일한지 아닌지를 내부적으로 아래와 동작이 된다.)
// 해시코드 값이 다르면 서로다른 객체로 판단을 하고, 해시코드 값이 같으면 equals()메소드로 다시 비교한다.
// equals()메소드가 true이면 동일한 객체로 보고, false면 다른객체로 보게된다.

// hashcode()메소드와 equals()메소드를 재정의를 안하면, 객체비교는 Object클래스의 설계 원리대로 객체비교작업이 일어나다.
// 재정의를 하면, 내가 원하는 대로 비교를 해서, 객체비교작업이 일어난다.
public class Key {

	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	// 재정의를 한 의미는 Object클래스의 객체비교 성격을 사용하지 않고, Key클래스만의 객체비교를 만들어서 사용.
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Key클래스의 equals()메소드 동작");
		
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		System.out.println("Key클래스의 hashCode()메소드 동작");
		
		return number;
	}
	
	
}
