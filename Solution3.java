package algo;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();	
		
		int count[] = new int [10];
		int number = a*b*c;
		//System.out.println(number);
		
		while(number>0) {
			count[number%10]++;
			number /= 10;
		}
		
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		

	}

}
