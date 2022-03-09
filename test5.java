package algo;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); //테스트숫자 입력
				
		for(int i=1;i<=t;i++) {
			int a = scan.nextInt();
			int arr [] = new int[5];
			int idx = 0;
			while(a>0) {
				arr[idx] = a%10;
				a /= 10;
				idx++;	
			}
			Arrays.sort(arr);
			int min = arr[0];
			int max = arr[4];
			for(int j=1;j<arr.length;j++) {
				min = min * 10 + arr[j];
				max = max * 10 + arr[4-j];
			}
			System.out.println("Case #" + i);
			System.out.println(max + min);
			//System.out.print(min);
			//System.out.print(max);
			//System.out.println(Arrays.toString(arr));
		}
	}

}
