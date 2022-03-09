package WeekPractice;

import java.util.*;

public class Baek_2805 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 나무의 수 
		int m = scan.nextInt(); // m미터이 나무 
		int arr [] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr); //10,15,17,20
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		
		int answer = 0;
		for(int i=arr[0];i<=arr[arr.length-1];i++) { //10~20	
			int sum = 0;
			for(int j=0;j<arr.length;j++) { //10,15,17,20
				int wood = 0;
				wood = arr[j] - i;
				if(arr[j]-i<=0) wood= 0;
				sum += wood;
				
			}
			answer = i;
			if(sum==m) break;
			//System.out.print(sum +" ");
			//wood = 0;
		}
		System.out.print(answer);
		//System.out.print(answer);
	}

}
