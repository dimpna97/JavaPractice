package algo;

import java.util.*;
import java.util.stream.IntStream;

public class Baek_15888 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int m = 0;
		int n = 0;
		int sum = -(b / a);
		int mul = c / a;
		// System.out.print(sum + " " + mul);

		List<Integer> list = new ArrayList<Integer>();
		if (mul < 0) {
			mul = Math.abs(mul);
		}
			for (int i = 1; i <= mul; i++) {
				if (mul % i == 0) {
					list.add(i); // 1,2,4,8,16,32
				}
			}
		//System.out.print(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) + list.get(list.size() - 1 - i) == sum || list.get(i) - list.get(list.size() - 1 - i) == sum) {
				m = list.get(i);
				n = list.get(list.size() - 1 - i);
			}
		}

		//System.out.print(m + " " + n);

		int num[] = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
		int m1 = m;
		int n1 = n;
		if (IntStream.of(num).anyMatch(x -> x == m1) && IntStream.of(num).anyMatch(x -> x == n1)) {
			System.out.print("이수근");
		} else if (IntStream.of(num).anyMatch(x -> x == m1) || IntStream.of(num).anyMatch(x -> x == n1)) {
			System.out.print("정수근");
		} else {
			System.out.print("둘다틀렸근");
		}

	}

}
