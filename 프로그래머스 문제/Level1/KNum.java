package level01;

import java.util.Arrays;

public class KNum {
	static public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int iNum, jNum, kNum;
        String[] tmp = new String[array.length];
        String strTmp = "";
        int answerIndex = 0;
        
        for(int i = 0; i < tmp.length; i++) {
        	tmp[i] = String.format("%d#", array[i]);
        	strTmp += tmp[i];
        }
        System.out.println(strTmp);
        
        for(int i = 0; i < commands.length; i++) {
        	int index = 0;
        	
        	iNum = commands[i][0] - 1;	//1
        	jNum = commands[i][1] - 1;	//4
        	kNum = commands[i][2] - 1;	//2
        	
        	String[] sortTmp = new String[strTmp.length()];
        	sortTmp = strTmp.split("#");
        	String[] subStringTmp = new String[jNum - iNum + 1];
        	
        	for(int j = iNum; j <= jNum; j++) {
        		subStringTmp[index] = sortTmp[j];
        		index++;
        	}
        	
        	int[] answerTmp = new int[subStringTmp.length];
        	
        	for(int j = 0; j < answerTmp.length; j++) {
        		answerTmp[j] = Integer.parseInt(subStringTmp[j]);
        	}
        	
        	Arrays.sort(answerTmp);
//        	for(int j = 0; j < answerTmp.length; j++) {
//        		System.out.print(answerTmp[j] + " ");
//        	}System.out.println();
        	
        	answer[answerIndex] = answerTmp[kNum];
        	answerIndex++;
        	
        }
        
//        for(int i = 0; i < answer.length; i++) {
//        	System.out.println(answer[i]);
//        }
        return answer;
    }
	
	public static void main(String[] args) {
		solution(new int[] {10, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
	}
}
