package level01;

public class MatrixAddition {
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		System.out.println("arr1[0].length : " + arr1.length);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[0].length;j++) {
				
				System.out.printf("arr1[%d][%d] : %d, arr2[%d][%d] : %d\n", i, j, arr1[i][j], i, j, arr2[i][j]);
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println("answer : " + answer[i][j]);
				
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		
		solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});
		//solution(new int[][] {{1},{2}}, new int[][] {{3},{4}});
		
	}
}
