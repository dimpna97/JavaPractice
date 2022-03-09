package WeekPractice;

import java.util.*;

public class Sol_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String arr[][] = new String[2*n-1][n];
		
		for(int i=0;i<arr.length/2+1;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i<j) {
					arr[i][j]="B";
				}else{
					arr[i][j]="G";
				}
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		
		
		//밑에줄
		for(int i=n;i<2*n-1;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int cnt = n;
				if(i-cnt<j) {
					arr[i][j] = "G";
					
				}else {
					arr[i][j] = "B";
				}
			}
		}
		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}

	}

}
