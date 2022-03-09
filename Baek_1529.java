package Baekjoon_Study;

import java.util.*;

public class Baek_1529 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		while (true) {
			s= scan.nextLine();
			if(s.equals("0")) break;
			
			char[] ch = new char[s.length()];
			for(int i=0;i<s.length();i++) {
				ch[i] = s.charAt(i);
			} // 반복문 안에 문자 배열쪼개서 넣어놓
			
			boolean answer = true;
			for(int i=0;i<ch.length-i-1;i++) {
				if(ch[i]!=ch[ch.length-i-1]) {
					answer = false;
					break;
				}
			}
			if(answer) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}	
	}

}
