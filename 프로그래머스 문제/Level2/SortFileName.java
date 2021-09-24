package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class DividedFileName implements Comparable<DividedFileName> {
	String head = "", number = "", tail = "", fileName;
	int numStart = 48;
	int numEnd = 59;
	int currlocation = 0;
	boolean isNUmberEnd = false;
	
	public DividedFileName(String fileName) {
		this.fileName = fileName;
		String[] tmp = fileName.split("");
		
		for(int i = 0; i < tmp.length; i++) {
			boolean flag = tmp[i].charAt(0) >= numStart && tmp[i].charAt(0) <= numEnd;
			
			if(flag && !isNUmberEnd) {
				number += tmp[i];
				currlocation++;
			}
			else
				if(currlocation == 0) head += tmp[i];
				else {
					tail += tmp[i];
					isNUmberEnd = true;
				}
		}
	}
	
	@Override
	public String toString() {
		return "head : " + head + ", " + "number :" + number + ", tail :" + tail +"\n";
	}
	
	@Override
	public int compareTo(DividedFileName o) {
		return head.compareTo(o.head) * -1;
	}
}

class ListComparator implements Comparator<DividedFileName> {

	@Override
	public int compare(DividedFileName o1, DividedFileName o2) {
		int com = o1.head.compareToIgnoreCase(o2.head);
		
		if(com == 0) {
			if(Integer.valueOf(o1.number) > Integer.valueOf(o2.number)) return 1;
			else if(Integer.valueOf(o1.number) < Integer.valueOf(o2.number)) return -1;
			else return 0;
		}
		
		return com;
	}
	
}

public class SortFileName {
	public static String[] solution(String[] files) {
		String[] answer = {};
		DividedFileName dn;
		List<DividedFileName> list = new ArrayList<DividedFileName>();
		
		for(String file : files) {
			dn = new DividedFileName(file);
			list.add(dn);
		}
		list.sort(new ListComparator());
		System.out.println(list);
		answer = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).fileName;
		}
			
		return answer;
	}
	
	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.11png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] files2 = {" F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		String[] result = solution(files);
		System.out.println(Arrays.toString(result));
	}
}
