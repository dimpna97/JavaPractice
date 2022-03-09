package algo;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int cnt = 1;
		for(int i=1;i<=t;i++) {
			String s = scan.next();
			for(int j=1;j<s.length();j++) {
				char [] arr = s.toCharArray();
				char A = arr[j-1];
				if(A==arr[s.length()]) {
					break;
				}
				if(arr[j-1] == arr[j]) {
					cnt++;
				}
				else {
					System.out.print(A);
					System.out.print(cnt);
					cnt = 1;
				}
			}
			
			
			
		}
	}

}
