package WeekPractice;

import java.util.*;

public class Baek_1654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		
		int[] arr = new int[k];
		long max = 0;
		
		for(int i=0;i<k;i++) {
			arr[i] = scan.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		max++;
		
		long min = 0;
		long mid = 0;
		
		while(min<max) {
			mid = (max+min) / 2;
			
			long cnt = 0;
			
			for(int i=0;i<arr.length; i++) {
				cnt += (arr[i]/mid);
			}
			
			if(cnt<n) {
				max = mid;
			}else {
				min = mid + 1;
			}
			
		}
		
		System.out.println(min-1);
	}

}
