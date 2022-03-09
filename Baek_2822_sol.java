package algo;

import java.util.*;

public class Baek_2822_sol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[8];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int[]idx = new int[8];
		int[]max = new int[5];
		
		int cnt = 0;
		
		for(int i=0;i<idx.length;i++) {
			idx[cnt] = arr[i];
			cnt++;
		}
		cnt = 0;
		
		int sum = 0;
		Arrays.sort(arr);
		
		for(int i=3;i<8;i++) {
			max[cnt] = arr[i];
			sum+= max[cnt];
			cnt++;
		}
		System.out.println(sum);
		
		for(int i=0;i<idx.length;i++) {
			for(int j=0;j<5;j++) {
				if(idx[i]==max[j]) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
