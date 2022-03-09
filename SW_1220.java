package study;

import java.util.*;

public class SW_1220 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = 10;
		int arr[][] = new int[100][100];

		for (int c = 1; c <= t; c++) {
			int n = scan.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = scan.nextInt();
				}
			}// 배열에 값을 입력함
			
			int cnt = 0;

			for (int j = 0; j < n; j++) {
				int happy = 0;
				for (int k = 0; k < n; k++) {
					if (arr[k][j] == 2 && happy == 1 ) {
						cnt++;
						happy = 0;
					}else if(arr[k][j] == 1) {
						happy = 1;
					}
				}
			}
			System.out.println("=========");
			System.out.println(cnt);
		}

	}

}
