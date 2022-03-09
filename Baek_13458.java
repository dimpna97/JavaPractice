package Baekjoon_Study;

import java.util.*;

public class Baek_13458 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		int cnt = 1*n;
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int b = scan.nextInt();
		int c = scan.nextInt();
		for(int i=0;i<n;i++) {
			temp[i] = arr[i]-b;
			//System.out.print(temp[i] + " ");
			
			while(temp[i]>0) {
				temp[i] -= c;
				cnt++;
			}
		}
		System.out.print(cnt);
		
	}

}
