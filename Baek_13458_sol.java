package Baekjoon_Study;

import java.util.Scanner;

public class Baek_13458_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int b = scan.nextInt();
		int c = scan.nextInt();
		long cnt = 0;

		for (int i = 0; i < n; i++) {
			arr[i] -= b;
			cnt++;
			if (arr[i] <= 0) {
				continue;
			} else {
				cnt += arr[i] / c;
				if (arr[i] % c > 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
