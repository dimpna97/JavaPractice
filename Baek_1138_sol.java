package Baekjoon_Study;

import java.util.*;

public class Baek_1138_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		arr[scan.nextInt()] = 1;
		
		for(int i=1;i<arr.length;i++) {
			int left = scan.nextInt();
			int cnt = 0;
			
			for(int j=0;j<n;j++) {
				if(arr[j]==0) {
					cnt++;
				}
				if(cnt == left+1) {
					arr[j] = i+1;
					break;
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
