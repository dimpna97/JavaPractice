package Baekjoon_Study;

import java.util.*;

public class Baek_1920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a [] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = scan.nextInt();
		}
		
		int answer [] = new int[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(b[i]==a[j]) {
					answer[i]++;
					break;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			System.out.println(answer[i]);
		}
	}
	
}
