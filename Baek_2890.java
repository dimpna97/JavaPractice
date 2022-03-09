package Baekjoon_Study;

import java.util.*;

public class Baek_2890 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.nextLine();
		Integer arr[] = new Integer[r]; // 합계
		int kayak[] = new int[r];
		int answer [] = new int[9];
		for (int i = 0; i < r; i++) {
			String s = scan.nextLine();
			char ch[] = s.toCharArray();
			int sum = 0;
			int num = 0;
			for(int j=0;j<s.length();j++) {
				if(ch[j] >='1' && ch[j]<='9') {
					sum += j;
					num = ch[j] - 48;
				}
			}
			arr[i] = sum;
			kayak[i] = num;
			
			Arrays.sort(arr,Collections.reverseOrder());
			
			System.out.print(arr[i] + " " + kayak[i]);
			System.out.println();
		}
	}

}
