package level01;

import java.util.Arrays;

public class Phonecatmon {
	static public int solution(int[] nums) {
        int answer = 1;
        int max = nums.length / 2;
        int prevNum = -1;
        
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++) {
        	if(nums[0] != nums[i] && nums[i] != prevNum) {
        		answer++;
        	}
        	prevNum = nums[i];
        }
        if(answer > max) return max;
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println("1 : " + solution(new int[] {5,6,10,4,5,7,2,3,5,6}));
		System.out.println("2 : " + solution(new int[] {3,3,3,2,2,4}));
		System.out.println("3 : " + solution(new int[] {3,3,3,2,2,2}));
		
	}
}
