package study;

import java.util.*;

public class Baek_12780 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String h = scan.nextLine(); //INHAUNIVERSITYISONEOFTHEBESTUNIVERSITYINTHEWORLD
		String n = scan.nextLine(); //UNIVERSITY
		
		int cnt = 0;
		
		for(int i=0;i<=h.length()-n.length();i++) {
			if(h.substring(i,i+n.length()).equals(n)) { //같으면 출력해
				cnt++;
			}
		}
		System.out.print(cnt);
		
	}

}
