package algo;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][3];
		int sum[] = new int [n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++){
				arr[i][j] = scan.nextInt();
			}
		} // 숫자 입력받기 
		
		for(int j=0;j<3;j++) {
			for(int i =0;i<n;i++) {
				for(int k= i+1;k<n;k++) {
					if(arr[i][j]==arr[k][j]) {
						arr[i][j]=0;
						arr[k][j]=0;
					}
				}
				sum[i] += arr[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(sum[i]);
		}
	}

}
