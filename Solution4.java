package algo;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		int n = scan.nextInt();
		int data[] = new int[n];
		
		for(int i=0;i< n;i++) {
			data[i] =scan.nextInt();
			int sum = 0;
			sum += data[i];
			System.out.println(sum/n);
		}
		

	}

}
