package algo;

import java.util.*;

public class Baek_2845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int p = scan.nextInt();
		int arr[] = new int[5];
		int answer[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			answer[i] = arr[i] - l*p;
		}
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
