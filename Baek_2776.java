package WeekPractice;

import java.util.*;

public class Baek_2776 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			scan.nextLine();
			String s[] = scan.nextLine().split(" ");
			int m =  scan.nextInt();
			scan.nextLine();
			String ss[] = scan.nextLine().split(" ");
			
			int answer [] = new int[ss.length];
			
			for(int j=0;j<ss.length;j++) {
				for(int k=0;k<s.length;k++) {
					if(ss[j].equals(s[k])) {
						answer[j] = 1;
						break;
					}else {
						answer[j] = 0;
					}
				}
				
			}
			for(int j=0;j<answer.length;j++) {
				System.out.println(answer[j]);
			}
		}

	}

}
