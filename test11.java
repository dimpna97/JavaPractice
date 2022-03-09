package algo;

import java.util.Arrays;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String arr[][] = new String[2*n-1][n];
		int green = 1;
		int blue = n-1;
		int cnt = 0;
		
		//윗
		for(int i=0;i<arr.length/2;i++) {
			for(int j=0;j<green;j++) {
				arr[i][cnt] = "G";
				cnt++;
			}
			for(int j=0;j<blue;j++) {
				arr[i][cnt] = "B";
				cnt++;
			}
			green++;
			blue--;
			cnt = 0;
		}
		
		//가운데
		for(int i=0;i<n;i++) {
			arr[n-1][i] = "G";
		}
		
		//밑에
		green = n-1;
		blue = 1;
		cnt = 0;
		for(int i=n;i<2*n-1;i++) {
			for(int j=0;j<blue;j++) {
				arr[i][cnt] = "B";
				cnt++;
			}
			for(int j=0;j<green;j++) {
				arr[i][cnt] = "G";
				cnt++;
			}
			cnt=0;
			blue++;
			green--;
		}
		System.out.print(Arrays.deepToString(arr));
	}

}
