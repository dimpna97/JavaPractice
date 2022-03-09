package Baekjoon_Study;

import java.util.*;

public class Baek_1181 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String words [] = new String [n];
		
		scan.nextLine(); //개행 버려야함 안그러면 하나가 안먹힘....짜
		
		for(int i=0;i<n;i++) {
			words[i] = scan.nextLine();
		}
		
//		Set<String> set = new HashSet<String>();
//		for(int i=0;i<n;i++) {
//			set.add(words[i]);
//		}
//		System.out.print(set);
//		String[]answer = set.toArray(new String[0]);
				
		Arrays.sort(words, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(words[0]);
		
		for(int i=1;i<n;i++) {
			if(!words[i].equals(words[i-1])) {
				System.out.println(words[i]);
				
			}
		}
		
		
		
//		Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
//		System.out.println(words[0]);
//
//		// ArrayList<String> list = new ArrayList<String>();
//		for (int i = 1; i < n; i++) {
//			// list.add(words[i]);
//
//			if (!words[i].equals(words[i - 1])) {
//				System.out.println(words[i]);
//			}
//		}
		
		
	}

}
