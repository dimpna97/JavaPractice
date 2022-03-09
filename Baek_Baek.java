package Baekjoon_Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Baek_Baek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		String arr[][] = new String[r][c];
		List<Integer> list = new ArrayList<>();
		int answer[] = new int[9];
		scan.nextLine();
		for(int i=0;i<r;i++) {
			arr[i] = scan.nextLine().split(""); //카약번호 쪼갠거 
		}
		for(int i=r-1;i>=0;i--) {
			for(int j=c-2;j>=1;j--) {
				if(!arr[i][j].equals(".")) { // 카약 넘버  
					list.add(j); //z카약 제일 큰 인덱스값 
					answer[Integer.parseInt(arr[i][j])-1] = j;  
					break;
				}
			}
		}
		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i) + " ");			
//		}
		
		HashSet<Integer> set = new HashSet<>(list);
		//System.out.print(set);
		ArrayList<Integer> newList = new ArrayList<Integer>(set);
		//System.out.println();
		Collections.sort(newList, Collections.reverseOrder());
		//for(int i=0;i<newList.size();i++) {
		//	System.out.print(newList.get(i) + " ");			
		//}
		for(int j=0;j<answer.length;j++) {
			for(int k=0;k<newList.size();k++) {
				if(answer[j]==newList.get(k)) {
					System.out.println(k+1);
				}
				
			}
		}
	}

}
