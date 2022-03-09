package WeekPractice;

import java.util.Scanner;

public class Baek_2775_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int m = scan.nextInt(); // 층수
			int n = scan.nextInt(); // ~호
			int floor[] = new int[m + 1]; // 0층부터 있다고 보면 됨
			int ho[] = new int[n]; //몇호인지 알수 있는거 
			
			for (int j = 0; j < floor.length; j++) {
				for (int k = 0; k < ho.length; k++) {
					ho[k] = k+1;
				}
				System.out.println();
			}

		}

	}

}
