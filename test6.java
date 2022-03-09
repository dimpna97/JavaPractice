package algo;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=1;i<=t;i++) {
			int n = scan.nextInt();
			System.out.println("Case #"+i);
			System.out.println(n*(n-3)/2);
		}
	}

}
