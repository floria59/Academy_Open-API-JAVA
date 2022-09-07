package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 배열복사
		
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5]; // 초기값은 0
		
		// 3번 반복 i -> 0, 1, 2
		for(int i = 0; i < oldIntArray.length; i++)
			{
			 	newIntArray[i] = oldIntArray[i];
			}
		
		// 5번 반복
		for(int i = 0; i < newIntArray.length; i ++)
			{
				System.out.println(newIntArray[i] + "," );
			}

	}

}
