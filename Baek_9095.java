package Baekjoon_Study;

import java.util.*;

public class Baek_9095 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[] = new int[11]; //1부터 10까지..
		
		//arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		//arr[4] = 7; arr[5] = 13;

		for(int i=0;i<t;i++) {
			int num = scan.nextInt(); //1,2,3의 합으로 나타내야 함 , 7
			for(int j=4;j<=num;j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[num]);
		}
	}

}
