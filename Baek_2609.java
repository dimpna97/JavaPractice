package WeekPractice;

import java.util.*;

public class Baek_2609 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int min = 0;
		if(n>m) {
			min = m;
		}else min = n;
		
		int gd = 0;
		for(int i=1;i<=min;i++) {
			if(n%i==0 && m%i==0) {
				gd = i;
			}
		}
		System.out.println(gd);
		System.out.println(n*m/gd);

	}

}
