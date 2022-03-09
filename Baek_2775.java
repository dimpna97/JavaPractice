package WeekPractice;

import java.util.*;

public class Baek_2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[15][15]; //0층부터 있다고 보면 됨 
		
		for(int j=0;j<arr.length;j++) {
			arr[j][1] = 1;
			arr[0][j] = j;
		} //층을 만들면 됨 (기존에 다 만들어놓고 불러오는 느낌으로 진행) 
		
		for(int j=1;j<arr.length;j++) { //행 
			for(int k=2;k<arr[j].length;k++) { //열 
				arr[j][k] = arr[j][k-1] + arr[j-1][k];
			}
		}
		
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++) {
			int m = scan.nextInt(); // 층수 
			int n = scan.nextInt(); // ~호 	
			System.out.println(arr[m][n]);			
		}
	}

}
