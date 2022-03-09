package Baekjoon_Study;

import java.util.*;

public class Baek_1302_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ArrayList<String> book = new ArrayList<String>();
		ArrayList<String> answer = new ArrayList<String>();
		
		int idx[] = new int[1001];
		int max = 0;
		
		for(int i=0;i<n;i++) {
			String s = scan.next();
			if(!book.contains(s)) {
				book.add(s);
			}//중복되지 않는 책들의 집합을 저장함 
			idx[book.indexOf(s)]++;
			if(idx[book.indexOf(s)]>max) {
				max = idx[book.indexOf(s)];
			}
		}
		for(int i=0;i<n;i++) {
			if(idx[i]==max) {
				answer.add(book.get(i));
			}
		}
		Collections.sort(answer);
		System.out.println(answer.get(0));

	}

}
