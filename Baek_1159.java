package Baekjoon_Study;

import java.util.*;

public class Baek_1159 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextLine();
		}
		Arrays.sort(arr);
		int cnt = 0;
		//char s = ' ';
		for (int i = 0; i < n - 1; i++) {
			if (arr[i].charAt(0) == arr[i + 1].charAt(0)) {
				cnt++;
			} else cnt = 0;
			if (cnt >= 5) {
				System.out.print(arr[i].charAt(0));
			}
			
		}

	}

}
