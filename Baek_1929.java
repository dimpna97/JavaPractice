package Baekjoon_Study;

import java.util.Scanner;

public class Baek_1929 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i=m;i<=n;i++) {
			boolean isPrime = true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		
		

	}

}
