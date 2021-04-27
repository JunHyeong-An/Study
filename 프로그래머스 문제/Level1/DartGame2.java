package level01;

public class DartGame2 {
	static int solution(String dartResult) {
		int answer = 0;
		int currScore = 0;
		int prevScore = 0;
		int totalScore = 0;
		String target = "";
		
		String[] arrTemp = dartResult.split("");
		
		for(int i = 0; i < arrTemp.length; i++) {
			boolean flag1 = arrTemp[i].equals("1") || arrTemp[i].equals("2") || arrTemp[i].equals("3") || arrTemp[i].equals("4") ||
							arrTemp[i].equals("5") || arrTemp[i].equals("6") || arrTemp[i].equals("7") || arrTemp[i].equals("8") ||  
							arrTemp[i].equals("9") || arrTemp[i].equals("0");
			boolean flag2 = arrTemp[i].equals("S") || arrTemp[i].equals("D") || arrTemp[i].equals("T"); 
			boolean flag3 = arrTemp[i].equals("*") || arrTemp[i].equals("#");
			
			if(flag1) {
				totalScore += prevScore;
				prevScore = 0;
				
				target += arrTemp[i];
//				System.out.println("flag1");
//				System.out.println("target : " + target);
			}
			else if(flag2) {
				prevScore = currScore;
				
//				System.out.println("flag2");
//				System.out.println("===계산 전===");
//				System.out.println("prevScore = " + prevScore);
//				System.out.println("currScore = " + currScore);
				
				if(arrTemp[i].equals("D")) {
					currScore = (int)Math.pow(Integer.parseInt(target), 2);
				}
				else if(arrTemp[i].equals("T")) {
					currScore = (int)Math.pow(Integer.parseInt(target), 3);
				}				
				else {
					currScore = Integer.parseInt(target);
				}
				
				target = "";
			}
			else if(flag3) {
				if(arrTemp[i].equals("*")) {
					prevScore *= 2;
					currScore *= 2;
				}
				else {
					currScore *= -1;
				}
			}
			
//			System.out.println("===계산 후===");
//			System.out.println("prevScore = " + prevScore);
//			System.out.println("currScore = " + currScore);
//			System.out.println("totalScore = " + totalScore);
//			System.out.println();
//			
			
		}
		
		totalScore = currScore + prevScore + totalScore;
		answer = totalScore;
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("1S2D3T"));		//32
		System.out.println(solution("1S2D*3T"));	//37
		System.out.println(solution("1D2S#10S"));	//9	
		System.out.println(solution("1D2S0T"));		//3
		System.out.println(solution("1S*2T*3S"));	//23
		System.out.println(solution("1D#2S*3S"));	//5
		System.out.println(solution("1T2D3D#"));	//-4
		System.out.println(solution("1D2S3T*"));	//59
	}
}
