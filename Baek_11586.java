package Baekjoon_Study;

import java.util.*;

public class Baek_11586 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String mirror [] = new String[n];
		for(int i=0;i<n;i++) {
			mirror[i] = scan.nextLine();
		}
		int m = Integer.parseInt(scan.nextLine());
		
		if(m==1) {
			for(int i=0;i<n;i++) {
				System.out.println(mirror[i]);
			}
		}else if(m==3) {
			for(int i=0;i<n;i++) {
				mirror[n-1-i] = mirror[i];
				System.out.println(mirror[i]);
			}
		}else if(m==2) {
			for(int i=0;i<n;i++) {
				String a = "";
				char ch [] = mirror[i].toCharArray();
				for(int j=0;j<n;j++) {
					ch[n-1-j] = ch[j];
					a = ch[j] + "";
					System.out.println(a);
				}
			}
		}
	}

}
