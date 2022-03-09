package Baekjoon_Study;

import java.util.*;

public class Baek_1302 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		String s[] = new String[n];		
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextLine();
		}
		Arrays.sort(s); //오름차순으로 배열함 
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		int cnt = 0;
		int max = 0;
		String temp = s[0];
		String answer = "";
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(temp)) { //책이름이 같은 경우 
				cnt++;
			}else { //책이름이 다른 경우 
				if(cnt>max) {
					max = cnt;
					answer = temp;
				}
				temp = s[i];
				cnt = 1;
			}
		}
		if(cnt>max) answer = temp;
		System.out.println(answer);
		
		
	}

}
