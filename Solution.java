package algo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int []answer = new int[5];
		for(int i=0;i<answer.length;i++) {
			answer[i] = scan.nextInt();
		}
		Arrays.sort(answer);
		int b = answer[0];
		int c = answer[4];
	System.out.print(b + "," + c);
		
	}

}
