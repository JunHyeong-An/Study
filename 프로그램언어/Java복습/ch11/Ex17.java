package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex17 {
	public static int getSum(Collection<Integer> col) {
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>(col);
		
		for(Integer i : list) {
			sum += i;
		}
		return sum;
	}
	
	public static double getAvg(int sum, int cnt) {
		double avg = 0;
		
		avg = sum / (double)cnt;
		
		return avg;
	}
	
	public static int getMax(Collection<Integer> col) {
		TreeSet<Integer> ts = new TreeSet<Integer>(col);
		return ts.last();
	}
	
	public static int getMin(Collection<Integer> col) {
		TreeSet<Integer> ts = new TreeSet<Integer>(col);
		return ts.first();
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("강자바", 80);
		map.put("이자바", 100);
		map.put("안자바", 90);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("이름  : " + key + ", ");
			System.out.println("점수 : " + map.get(key));
		}
		
		System.out.print("참가자 명단 : ");
		System.out.println(set);
		
		Collection<Integer> col = map.values();
		
		int sum = getSum(col);
		System.out.println("총점 : " + sum);
		
		double avg = getAvg(sum, col.size());
		System.out.println("평균 : " + avg);
		
		int max = getMax(col);
		System.out.println("최댓값 : " + max);
		
		int min = getMin(col);
		System.out.println("최솟값 : " + min);
	}
}
