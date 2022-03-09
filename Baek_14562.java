package study;

import java.util.*;

public class Baek_14562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int S[] = new int[c];
		int T[] = new int[c];
		
		for(int i=0;i<c;i++) {
			S[i] = scan.nextInt();
			T[i] = scan.nextInt();
		}
		
		for(int i=0;i<c;i++) {
			int min = cnt(S[i], T[i], 0);
			System.out.println(min);
		}
		
	}
	
	public static int cnt(int S, int T, int count) {
		if(S>T) {
			return 0;
		}
		if(S==T) {
			return count;
			
		}else {
			int min1 = cnt(S*2, T+3, count+1); //방법1
			int min2 = cnt(S+1, T, count+1); //방법2 
			return Math.min(min1,min2);
		}
	}

}
