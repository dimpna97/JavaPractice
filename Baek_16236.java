package Baekjoon_Study;

import java.util.*;

public class Baek_16236 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		} // 배열 입력받음 
		
		//이동 방향
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		
		
	}

}
