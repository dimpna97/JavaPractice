package study;

import java.util.*;

/*
 * 비밀번호는 알파벳 소문자, 대문자, 숫자, 특수문자로만 이루어져 있다. 비밀번호는 6글자 이상이어야 한다. 숫자는 하나 이상 포함되어야
 * 한다. 알파벳 소문자는 하나 이상 포함되어야 한다. 알파벳 대문자는 하나 이상 포함되어야 한다. 특수 문자는 하나 이상 포함되어야 한다.
 * 사용할 수 있는 특수 문자는 !@#$%^&*()-+이다.
 */

public class Baek_16944 {

	public static boolean special(char c) {

		char t[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };
		for (int i = 0; i < t.length; i++) {
			if (c == t[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		String s = scan.nextLine();
		char []input = s.toCharArray();
		int cnt = 0;

		boolean answer[] = new boolean[4];		
		
		for (int i = 0; i < input.length; i++) {

			if ('0' <= input[i] && input[i] <= '9') {
				answer[0] = true;
			} else if ('a' <= input[i] && input[i] <= 'z') {
				answer[1] = true;
			} else if ('A' <= input[i] && input[i] <= 'Z') {
				answer[2] = true;
			} else if (special(input[i])) {
				answer[3] = true;
			}
			
		}
		
		//System.out.println(input[0]);
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == false) {
				cnt++;
			}
		}
		//만약 다 충족을 했는데 비밀번호 개수가  충족이 안될경우 위에서는 cnt = 0이기 때문 > cnt 값을 더 더한다.
		
		int total = 6-n-cnt;
		
		if(6 - n > 0) {
			for(int i=0;i<total;i++) {
				cnt++;
			}
		}
		
		System.out.print(cnt);

	}

}
