package ch11;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
class Descomp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			
			return i1.compareTo(i2) * -1; 
		}
		return -1;
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Integer[] arr = {5,3,4,2,1,8,6,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Descomp());
		System.out.println(Arrays.toString(arr));
	}
}
