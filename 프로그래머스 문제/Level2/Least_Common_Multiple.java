package quiz;

public class Least_Common_Multiple {	
	// 여러개의 최소공배수는 lcm(a,b,c) = lcm(a,lcm(b,c))
	// => 먼저 두개의 최소공배수를 구하고 그 수와 그 다음수와의 최소공배수를 구한다. 이걸 반복
	public static int gcd(int x, int y) {
		if(y == 0) return x;
		else return gcd(y, x % y);
	}
	
	public static int lcm(int x, int y) {
		return (x * y) / gcd(x, y);
	}
	
	public static int solution(int[] arr) {
		int answer = arr[0];
        
       for(int i = 1; i < arr.length; i++) 
    	   answer = lcm(answer, arr[i]);
        
        
       return answer;
    }
}
