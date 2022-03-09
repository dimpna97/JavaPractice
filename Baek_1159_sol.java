package Baekjoon_Study;

import java.util.*;

public class Baek_1159_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[26];
		scan.nextLine();
		
		for(int i=0;i<n;i++) {
			String s = scan.next();
			arr[s.charAt(0)-'a']++;
		}
		
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=5) {
				cnt++;
				System.out.print((char)(i+97));
			}
		}
		
		if(cnt==0) {
			System.out.println("PREDAJA");
		}
	}

}
