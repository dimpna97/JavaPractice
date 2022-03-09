package WeekPractice;

import java.util.*;

public class Baek_2798_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		int answer = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(answer<sum && sum <=m) {
						answer = sum;
					}
				}
			}
		}
			System.out.println(answer);
		
	}

}
