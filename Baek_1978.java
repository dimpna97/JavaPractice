package WeekPractice;

import java.util.*;

public class Baek_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			boolean isPrime = true;
			int num = scan.nextInt();
			if (num == 1)
				continue;

			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				cnt++;

		}
		System.out.print(cnt);

	}

}
