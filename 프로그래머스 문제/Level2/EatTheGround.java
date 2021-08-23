package quiz;

public class EatTheGround {
	static int solution(int[][] land) {
		int answer = 0;
		int myScore = 0;
		int bannedCol = -1;
		int currIndex = 0;
		
		for(int i = 0; i < land.length; i++) {
			int max = 0;
			for(int j = 0; j < land[0].length; j++) {
				System.out.println("bannedCol : " + bannedCol);
				if(j == bannedCol) continue;
				max = max < land[i][j] ? land[i][j] : max;
				if(max == land[i][j]) currIndex = j;
				System.out.println("max : " + max);
				System.out.println("currIndex : " + currIndex);
				System.out.println();
			}
			System.out.println("step : " + max);
			System.out.println("================================================");
			bannedCol = currIndex;
			myScore += max;
		}
		answer = myScore;
		return answer;
	}
	
	public static void main(String[] args) {
//		int[][] arr = new int[][] {{1,9,3,8},{5,9,7,8},{4,3,2,1}, {4,3,2,1}};
		int[][] arr = new int[][] {{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}};
		int result = solution(arr);
		System.out.println(result);
	}
}
