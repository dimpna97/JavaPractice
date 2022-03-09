package WeekPractice;

import java.util.*;

public class Baek_3863 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			scan.nextLine();
			if (n == 0 && m == 0)
				break;
			int a = 0, b = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				String nn[] = scan.nextLine().split(" "); // 쪼갠거 근데 2,3만 필요함
				a = Integer.parseInt(nn[2]);
				b = Integer.parseInt(nn[3]);
				list.add(a);
				list.add(b);
			}
			System.out.println(list);

			int c = 0, d = 0;
			for (int i = 0; i < m; i++) {
				String mm[] = scan.nextLine().split(" "); // 0,1
				c = Integer.parseInt(mm[0]);
				d = Integer.parseInt(mm[1]);

				// System.out.println(c+ " "+ d);
				int cnt = 0;
				for (int k = 0; k < list.size(); k += 2) {
					if (c >= list.get(k)) {
						if (k + 1 < list.size() && c <= list.get(k) || list.get(k + 1) < c + d) {
							cnt++;
						}

					} else {
						if (k + 1 < list.size() && list.get(k) <= c || list.get(k + 1) < c + d) {
							cnt++;

						}
					}

					System.out.println(cnt);
					cnt = 0;
				}

			}

		}

	}
}
