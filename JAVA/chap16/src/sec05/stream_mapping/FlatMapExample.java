package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" "))) // 4개 문자열을 갖는 stream객체
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(","); // "10"  " 20"  " 30"
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim()); // 10 20 30
				}
				// 참조하는 요소개수만큼 반복이 발생이 되고, 리턴값이 누적되어 IntStream객체로 반환한다.
				return Arrays.stream(intArr);  // 첫번째 리턴값 10 20 30 두번째 리턴값 40 50 60 
				
			})
			.forEach(number -> System.out.println(number));

	}

}
