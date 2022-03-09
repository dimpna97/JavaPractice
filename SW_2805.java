package study;

import java.util.*;

public class SW_2805 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=1;i<=t;i++) {
			int n = scan.nextInt();
			int arr[][] = new int[n][n];
			int sum = 0;
			
			for(int j=0;j<n;j++) {
				String s = scan.next();
				for(int k=0;k<s.length();k++) {
					arr[j][k] = s.charAt(k) - '0';
				}	
			}//배열값 입력
		
			for(int c=0;c<n/2;c++) {
				for(int l = n/2-c;l<=(n/2+c);l++) {
					sum += arr[c][l];
				}
			} //위의 삼각형 
					
			for(int c=n/2;c>=0;c--) {
				for(int l = n/2-c;l<=n/2+c;l++) {
					sum += arr[n-c-1][l];
				}
			} //아래 삼각형 
			System.out.print("#" + i + " ");
			System.out.print(sum);
			System.out.println();
		}
	}

}
