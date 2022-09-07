package sec06.exam05_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 다차원 배열 : 2차원배열, 행렬구조로 생각하라
		// int[][] mathScores = new int[행의크기][렬의크기];
		
		int[][] mathScores = new int[2][3]; // 2*3 행렬구조
		for(int i = 0; i < mathScores.length; i++) 
			{ // 행의크기 2
				for(int k = 0; k < mathScores[i].length; k++) 
					{ // 1행 3열 관점, 2행 3열 관점
						System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);	
					}	
			}
		
		System.out.println();
		
		// 가변배열(Jagged Array) 각 행마다 열의 크기가 다른 배열. 5개. 메모리낭비
		int[][] englishScores = new int [2][];
		englishScores[0] = new int[2]; // 1행은 열을 2로 하겠다. 
		englishScores[1] = new int[3]; // 2행은 열을 3으로 하겠다. 
		
		for(int i = 0; i < englishScores.length; i++) 
			{ // 행의크기 2
				for(int k = 0; k < englishScores[i].length; k++) 
					{ // 1행 2열 관점, 2행 3열 관점
						System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);	
					}	
			}
		
		System.out.println();
		
		// 1행 열의 크기는 2, 2행의 열의크기는 3
		int[][] javaScores = { {95,80}, {92,96,80} };
		
		for(int i = 0; i < javaScores.length; i++) 
			{ // 행의크기 2
				for(int k = 0; k < javaScores[i].length; k++) 
					{ // 1행 2열 관점, 2행 3열 관점
						System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);	
					}	
			}
		
		}
	}
