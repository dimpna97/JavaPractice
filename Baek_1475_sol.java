package Baekjoon_Study;

import java.util.*;

public class Baek_1475_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		n = n.replace('9', '6');
		int arr[] = new int[9];
		
		for(int i=0;i<n.length();i++) {
			arr[n.charAt(i) - 48]++;
		}
		arr[6] = (arr[6] + 1) / 2;
		
		Arrays.sort(arr);
		System.out.println(arr[8]);
	}

}
