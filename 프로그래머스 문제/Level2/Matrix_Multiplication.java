package quiz;

public class Matrix_Multiplication {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};

		int a_row = arr1.length;
		int a_col = arr1[0].length;
		int b_row = arr2.length;
		int b_col = arr2[0].length;
		answer = new int[a_row][b_col];

		System.out.println(a_row);
		System.out.println(b_col);
		for(int i = 0; i < a_row; i++) {
			for(int j = 0; j < b_col; j++) {
				int sum = 0;

				for(int k = 0; k < a_col; k++) {
					sum += arr1[i][k] * arr2[k][j];
//					System.out.println("arr1 : " + arr1[i][k]);
//					System.out.println("arr2 : " + arr2[k][j]);
//					System.out.println("sum : " +  sum);
//					System.out.println();
				}
				
				answer[i][j] = sum;
//				System.out.println(i);
//				System.out.println(j);
			}
		}

		for(int i = 0; i < a_row; i++) {
			for(int j = 0; j < b_row; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}

	public static void main(String[] args) {
				solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}});
//		solution(new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}});
	}
}
