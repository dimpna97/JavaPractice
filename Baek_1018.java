//package Baekjoon_Study;
//
//import java.util.*;
//
//public class Baek_1018 {
//
//	static int min = Integer.MAX_VALUE;
//	static char arr[][];
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		arr = new char[n][m];
//		
//		for (int i = 0; i < arr.length; i++) {
//			String s = scan.next();
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = s.charAt(j);
//			}
//		} // 입력받음
//
//		for (int i = 0; i < n - 7; i++) {
//			for (int j = 0; j < m - 7; j++) {
//				solve(i,j);
//			}
//		}
//		System.out.println(min);
//	}
//	
//	public static int solve(int x, int y) {
//		int cnt1 = 0; int cnt2 = 0; 
//		
//		for(int i= x;i<x+8;i++) {
//			for(int j= y;j<y+8;j++) {
//				if((i+j)%2==0) {
//					if(arr[i][j]=='B') {
//						cnt1++;
//					}else cnt2++;
//				}else {
//					if(arr[i][j]=='B') {
//						cnt2++;
//					}else cnt1++;
//				}
//				
//			}
//		}
//		
//		min = Math.min(min, cnt2);
//		min = Math.min(min, cnt1);
//		//return;
//	}
//}
