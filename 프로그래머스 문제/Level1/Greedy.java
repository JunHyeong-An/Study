package level01;

public class Greedy {
	static public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j] && lost[i] > 0 && reserve[j] > 0) {
					System.out.println("분실 : " + lost[i]);
					System.out.println("빌려줌 : " + reserve[j]);
					System.out.println();
					lost[i] = -2;
					reserve[j] = -2;

					answer++;
				}
			}
		}
		
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j] && (lost[i] > 0 && reserve[j] > 0)) {
					System.out.println("분실 : " + lost[i]);
					System.out.println("빌려줌 : " + reserve[j]);
					System.out.println();
					lost[i] = -2;
					reserve[j] = -2;

					answer++;
				}
			}
		}
		System.out.print("lost : ");
		for(int i = 0; i < lost.length; i++) {
			System.out.print(lost[i] + " ");
		}System.out.println();


		System.out.print("reserve : ");
		for(int i = 0; i < reserve.length; i++) {
			System.out.print(reserve[i] + " ");
		}System.out.println();

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		//		solution(5, new int[] {2, 4}, new int[] {1, 3, 5});
		//		solution(5, new int[] {2, 4}, new int[] {3});
		//		solution(3, new int[] {3}, new int[] {1});
		//		solution(10, new int[] {1, 5, 29}, new int[] {2, 4, 6, 28, 29}); //8
		solution(5, new int[] {1, 2, 3}, new int[] {2, 3, 4}); //4
	}
}
