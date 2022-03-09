package algo;

import java.util.Scanner;

public class test14 {

	// 블라인드 문제

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(); // m층 건물
		int n = scan.nextInt(); // n개 창문

		String[] line = new String[5 * n + 1];
		char[][] arr = new char[5 * n + 1][5 * m + 1]; // 칸을 만듦
	
		for (int i = 0; i < line.length; i++) {
			line[i] = scan.nextLine(); // 6줄입력받음	
		}
		
		
		
	}

}