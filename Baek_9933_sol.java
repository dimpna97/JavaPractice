package Baekjoon_Study;

import java.util.*;

public class Baek_9933_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<n;i++) {
			list.add(scan.next());
		}
		
		for(int i=0;i<list.size();i++) {
			String s = new StringBuffer(list.get(i)).reverse().toString();
			if(list.contains(s)) {
				System.out.print(s.length() + " " + s.charAt(s.length()/2));
				return;
			}
			//System.out.println(s);
		}
	}

}
