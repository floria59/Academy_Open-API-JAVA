package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주사위 1~6 범위의 숫자를 랜덤으로 출력하는 기능
		int num = (int)(Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);
	}

}
