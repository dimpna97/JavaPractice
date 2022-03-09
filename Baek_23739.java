package WeekPractice;

import java.util.*;

public class Baek_23739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double arr[] = new double[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		double sum = 30;
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(sum-arr[i]>=0) { //30보다 작은 경우 
				cnt++;
				sum -= arr[i];
				if(sum<=0) sum = 30;
			}else if(sum>=arr[i]/2) { //반값보다 큰경우~ cnt++해줌 
				cnt++;
				sum = 30;
			}else {	//절반도 못 건든 경
				sum = 30;
			}
		}
		System.out.println(cnt);
	}

}
