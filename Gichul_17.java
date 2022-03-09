package study;

import java.util.*;

public class Gichul_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= t; i++) {
			String s[]= scan.nextLine().split(" ",1); // 점수 번호 5 5 10 10 10 15 15 15 20 20
			int score[] = new int[4];
			for (int j = 0; j < score.length; j++) {
				String a = scan.nextLine();//1OOOOXXXXXX
				for (int k = 0; k < a.length(); k++) {
					if (a.charAt(k) == 'O') {
						score[j] += Integer.parseInt(s[k]);
					}
				}
				System.out.println(score[0]);
			}
			// System.out.println("Case #" + i);
		}

	}

}
