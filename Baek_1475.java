package Baekjoon_Study;

import java.util.Scanner;

public class Baek_1475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int arr[] = new int[10];
		int a = 0;
		
		for(int i=0;i<s.length();i++) {
			a = s.charAt(i) - '0';
			arr[a]++;
		}
		
		int b = (arr[6] + arr[9]);
		if(b%2==0) {
			arr[6] = b/2;
			arr[9] = b/2;
		}else {
			arr[6] = b/2 +1;
			arr[9] = b/2 +1;
		}
		int max = 0;
		for(int i : arr) {
			max = Math.max(max, i);
		}
		System.out.println(max);
		
	}

}
