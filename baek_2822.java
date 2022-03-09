package algo;

import java.util.*;

public class baek_2822 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[8][2];
		int result[] = new int[5];
		int sum = 0;
		
		//점수 저장 
		for(int i=0;i<arr.length;i++) {
			arr[i][0] = scan.nextInt(); // 점수 
			arr[i][1] = i+1; // 문제 번호 
			//System.out.print(arr[i][1] + " ");
		}
		
		//점수를 기준으로 저장
		Arrays.sort(arr, (int[]a, int[]b) -> {
			return b[0] - a[0];
		});
		
		for(int i=0;i<5;i++) {
			sum += arr[i][0];
			result[i] = arr[i][1];
		}
		
		Arrays.sort(result);
		
		System.out.println(sum);
		for(int i=0;i<5;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
