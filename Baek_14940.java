package Baekjoon_Study;

import java.util.*;

public class Baek_14940 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int arr[][] = new int [m][n];
		int cnt[][] = new int [m][n];
		boolean visited[][] = new boolean[m][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
				if(arr[i][j]==2) {
					
				}
			}
		}
		//가로랑 세로로만 움직일 수 있음
		
		int x = 0, y = 0;
		
		int[]dx = {0,0,-1,1};
		int[]dy = {-1,1,0,0};
		
		
	}

}
