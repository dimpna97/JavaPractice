package Baekjoon_Study;

import java.util.*;

public class Baek_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int arr[] = {x, w-x, y, h-y};
		Arrays.sort(arr);
		System.out.print(arr[0]);
	}

}
