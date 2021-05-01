package level01;

import java.util.ArrayList;
import java.util.List;

public class Crane {
	static public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
//        System.out.println("변경 전");
//        for(int i = 0; i < board.length; i++) {
//        	for(int j = 0; j < board[i].length; j++) {
//        		System.out.print(board[i][j] + " ");
//        	}System.out.println();
//        }
//        System.out.println();
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]-1] != 0) {
        			list.add(board[j][moves[i]-1]);
        			board[j][moves[i]-1] = 0;
        			break;
        		}
        	}
        }
        
        
        for(int i = 0; i < list.size() - 1; i++) {
//        	System.out.println("i = " + i);
        	if(list.get(i) == list.get(i+1)) {
        		System.out.print(list.get(i) + " ");
        		System.out.println(list.get(i+1) + "제거");
        		list.remove(i+1);
        		list.remove(i);
        		answer += 2;
        		i=-1;
        	}
//        	System.out.println(list);
//        	System.out.println();
        }
        
        
//        System.out.println("변경 후");
//        for(int i = 0; i < board.length; i++) {
//        	for(int j = 0; j < board[i].length; j++) {
//        		System.out.print(board[i][j] + " ");
//        	}System.out.println();
//        }
//        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
//		solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, 
//				new int[] {1,5,3,5,1,2,1,4});
		

//		solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, 
//				new int[] {1, 5, 3, 5, 1, 2, 5, 1, 4, 3});
	}
}
