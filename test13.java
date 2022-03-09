package algo;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(); //m층 건물
		int n = scan.nextInt(); //n개의 창문
		scan.nextLine();
		
		String[] window = new String[n+1];
		int idx = 0;
		for(int i=0;i<window.length;i++) {
			window[i] = "";
		}
		
		int answer [] = new int[5];
		for(int i=0;i<m*5+1;i++) {
			String s = scan.nextLine();
			if(s.contains("*") || s.contains(".")) {
				for(int j =1 ; j<5*n+1;j+=5) {
					window[idx] += s.charAt(j);
					idx++;
				}
				idx -= n;
			}else {
				for(int j=0;j<window.length;j++) {
					if(window[j].equals("....")) {
						answer[0]++;
					}else if(window[j].equals("*...")) {
						answer[1]++;
					}else if(window[j].equals("**..")) {
						answer[2]++;
					}else if(window[j].equals("***.")) {
						answer[3]++;
					}else if(window[j].equals("****")){
						answer[4]++;
					}
					window[j]="";
				}
				idx = 0;
			}
		}
		for (int k : answer) {
			System.out.print(k + " ");
		}
	}
	

}
