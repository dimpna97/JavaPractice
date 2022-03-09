package WeekPractice;

import java.util.*;

public class Baek_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		char ch[] = s.toCharArray();
		char a[][] = new char[s.length()/k][k];
		for(int i=0;i<s.length()/k;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = ch[i];
				System.out.print(a[i][j]);
			}
		}
	}

}
