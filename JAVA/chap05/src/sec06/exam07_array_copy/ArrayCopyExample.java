package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열복사 기능의 메서드
		
		String[] oldStrArray = {"java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		//System.arraycopy("java", "array", "copy", "java" , newStrArray, 0, oldStrArray.length);

		for(int i = 0; i < newStrArray.length; i++ )
			{
				System.out.println(newStrArray[i] + ",");
			}
		
	}

}
