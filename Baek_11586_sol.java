package Baekjoon_Study;

import java.util.*;

public class Baek_11586_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char ch[][] = new char[n][n];
		for(int i=0;i<n;i++) {
			String s= scan.next();
			for(int j=0;j<n;j++) {
				ch[i][j] = s.charAt(j);
			}
		} // 값 입력받음 
		
		int m = scan.nextInt(); 
		
		if(m==1) { // 같을때 
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(ch[i][j]);
				}
				System.out.println();
			}
			
		}else if(m==2) { //좌우로 움직일때 
			for(int i=0;i<n;i++) {
				for(int j=0;j<n/2;j++) {
					char temp = ch[i][j];
					ch[i][j] = ch[i][n-j-1];
					ch[i][n-j-1] = temp;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(ch[i][j]);
				}
				System.out.println();
			}
			
		}else if(m==3) { // 상하로 움직일때  
			for(int i=0;i<n/2;i++) {
				for(int j=0;j<n;j++) {
					char temp = ch[i][j];
					ch[i][j] = ch[n-i-1][j];
					ch[n-i-1][j] = temp;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(ch[i][j]);
				}
				System.out.println();
			}
			
		}
	}

}
