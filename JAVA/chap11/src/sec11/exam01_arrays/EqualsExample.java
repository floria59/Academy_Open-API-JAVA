package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열복사. 
		
		//원본배열
		int[][] original = { {1, 2}, {3, 4}};
		
		
		//얕은복사후 비교. 주소공유. 원본배열 또는 사본배열이 변경될 때 서로 참조하는 값이 변경된다.
		System.out.println("얕은 복제 후 비교");
		// 사본배열
		int[][] cloned1 = Arrays.copyOf(original, original.length); //새로운 배열기억장소. 1차원하위배열은 주소가 공유
		
//		cloned1[0][0] = 10;
//		System.out.println("original: " + original[0][0]); // 10
		
		
		
		System.out.println("배열 번지 비교: " + original.equals(cloned1)); // false
		System.out.println("1차 배열 항목값 비교:" + Arrays.equals(original, cloned1)); // true
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1)); // true
		
		//깊은 복사후 비교.  원본배열과 사본배열이 각각 변경될 때 서로 간의 값은 바뀌지 않는다.
		System.out.println("깊은 복제후 비교");
		int[][] cloned2 = Arrays.copyOf(original, original.length); //새로운 배열기억장소
		
		// 이구문의 여부에 따라 얕은복사,깊은복사로 구분된다. (중요포인트)
		cloned2[0] = Arrays.copyOf(original[0], original[0].length); //1행의 기억장소 새로생성
		cloned2[1] = Arrays.copyOf(original[1], original[1].length); //2행의 기억장소 새로생성
		
		System.out.println("배열 번지 비교: " + original.equals(cloned2)); // false
		System.out.println("1차 배열 항목값 비교:" + Arrays.equals(original, cloned2)); //false 
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2)); // true 

	}

}
