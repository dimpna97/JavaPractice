package WeekPractice;

import java.util.*;

public class Baek_13909 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int cnt = 0;
		for(int i=1;i*i<=n;i++) {
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
