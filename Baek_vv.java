package WeekPractice;

import java.util.*;

public class Baek_vv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String arr[][] = new String[n][n];

		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < n; j++) { // 열
				if (i == 0 || i == arr.length - 1) { // 첫행과 마지막행은 다 *임
					arr[i][j] = "*";
				}else if (i < arr.length / 2) {
					if(j==0 || i==j || j==n-i-1 || j==n-1) {
						arr[i][j] = "*";						
					}else {
						arr[i][j] = " ";
					}
				
				} else {
					for (int k = 0; k < n; k += i) {
						arr[i][k] = "*";
						arr[i][n - 1 - k] = "*";

						if (k % i != 0) {
							arr[i][k] = " ";
							arr[i][n - 1 - k] = " ";
							System.out.println("나야");
						}
					}
				}

				if (arr[i][j] == null) {
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
