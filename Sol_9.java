package WeekPractice;

import java.util.*;

public class Sol_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,900,0,200,150,0,30,50};
		int price = 420;
		int cnt = 0;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			cnt++;
			if(sum>price) {
				sum = 0;
				cnt = 0;
			}
			
		}
		System.out.println();

	}

}
