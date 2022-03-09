package algo;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = {1, 2, 4, 3, 2, 5, 6, 1};
		int player = 0;
		int min = arr[0]+arr[n];
		for(int i=0; i<arr.length/2; i++) {
			int answer = arr[i]+arr[i+n];
			if(min>answer) {
				min = answer;
				player++;
			}
		}
		System.out.println(player+1);
	}

}
