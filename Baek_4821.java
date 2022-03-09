package Baekjoon_Study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baek_4821 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;

			scan.nextLine();

			String s[] = scan.nextLine().split(",");
			ArrayList<Integer> start = new ArrayList<Integer>();
			ArrayList<Integer> end = new ArrayList<Integer>();
			ArrayList<Integer> page = new ArrayList<Integer>();

			for (int i = 0; i < s.length; i++) {
				// System.out.println(s[i]);
				// if(Integer.parseInt(s[i].split("-")[0])<n) {
				start.add(Integer.parseInt(s[i].split("-")[0]));
				if (!s[i].contains("-")) {
					end.add(Integer.parseInt(s[i]));
				} else {
					end.add(Integer.parseInt(s[i].split("-")[1]));
				}
				for (int j = start.get(i); j <= end.get(i); j++) {
					if (j <= n)
						page.add(j);
				}
				// }
//			for(int k=0;k<page.size();k++) {
//				if(page.get(k)>n) {
//					page.remove(k);
//				}
//			}

			}
			Set<Integer> set = new HashSet<Integer>(page);
			ArrayList<Integer> newList = new ArrayList<Integer>(set);
//		System.out.println(start);
//		System.out.println(end);
//		System.out.println(page);
//		System.out.println(newList);
			System.out.println(newList.size());

		}
	}

}
