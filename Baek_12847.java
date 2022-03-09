package study;

import java.util.*;

public class Baek_12847 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= scan.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		for(int j=n-1;j>=m-1;j--) {
			max += arr[j];
		}
		System.out.print(max);
	}

}
