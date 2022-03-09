package Baekjoon_Study;

import java.util.*;

public class Baek_2869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt(); //up 
		long b = scan.nextInt(); //down 
		long v = scan.nextInt(); //움직여야할 거리 
		// (n-1) * (a-b) + a = v
		long day = (v-b)/(a-b);
		
		if((v-b)%(a-b)!=0) {
			day++;
		}
		System.out.println(day);
		
		
	}

}
