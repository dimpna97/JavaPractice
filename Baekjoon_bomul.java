package study;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_bomul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}//a를 입력받음
		
		Arrays.sort(a); //{0,1,1,1,6}
		Arrays.sort(b);
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += a[i] * b[n-i-1];
		}
		System.out.print(sum);
	}

}
