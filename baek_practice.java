//package Baekjoon_Study;
//
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class baek_practice {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = new ArrayList<Integer>();
//		int num = 0;
//		int num2 = 0;
//		boolean v[] = new boolean[10];
//
//		loop: while (list.size() <= 1000000) {
//			num++;
//			num2 = num;
//			Arrays.fill(v, false); 
//			while (num2 != 0) {
//				if (v[num2 % 10]) continue loop;
//				v[num2 % 10] = true;
//				num2 /= 10;
//			}
//			list.add(num);
//
//		}
//
//		Scanner scan = new Scanner(System.in);
//		List<Integer> input = new ArrayList<Integer>();
//
//		do {
//			input.add(Integer.parseInt(scan.nextLine()));
//
//		} while (input.get(input.size() - 1) != 0);
//		
//		scan.close();
//
//		for (int i = 0; i < input.size(); i++) {
//			if (input.get(i) != 0)
//				System.out.println(list.get(input.get(i)- 1));
//		}
//
//	}
//}
