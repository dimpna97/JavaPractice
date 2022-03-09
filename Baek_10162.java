package algo;

import java.util.*;

public class Baek_10162 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a = 0, b = 0, c = 0;
		while (t >= 10) {
			if (t >= 300) {
				t -= 300;
				a++;
			} else if (t >= 60) {
				t -= 60;
				b++;
			} else if (t >= 10) {
				t -= 10;
				c++;
			}
		}

		if (t != 0) {
			System.out.print(-1);
		} else
			System.out.print(a + " " + b + " " + c);
	}

}
