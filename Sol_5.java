package WeekPractice;

import java.util.*;

public class Sol_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int player[] = new int[4];
		int arr[] = {1,2,3,4,1,2,3,4};
		int min = arr[0]+arr[4];
		int idx = 0;
		for(int i=0;i<arr.length/2;i++) {
			player[i] = arr[i]+arr[i+4];
			if(min>=player[i]) {
				min = player[i];
				idx = i+1;
			}
		}
		System.out.print(idx);
		
	}

}
