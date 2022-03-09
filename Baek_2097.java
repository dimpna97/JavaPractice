package Baekjoon_Study;

import java.util.*;

public class Baek_2097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = (int) Math.sqrt(n);
		//System.out.print(a);
		if(n<=4) {
			System.out.println(4);
		}
		
		int ans = 4*(a-1);
		if( n == a * a ) {}
		else if(n - (a*a)> a) {
			ans += 4;
		}else ans +=2;
		System.out.println(ans);
	}

}
