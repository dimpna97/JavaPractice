package Baekjoon_Study;

import java.util.*;

public class Baek_1874 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		
		ArrayList<String> list = new ArrayList<String>();
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		int idx = 0;
		
		for(int i=1;i<=n;i++) {
			st.push(i);
			list.add("+");
			while(!st.isEmpty()) {
				if(st.peek()==arr[idx]) {
					st.pop();
					list.add("-");
					idx++;
				}else {
					break;
				}
			}
		}
			if(!st.isEmpty()) {
				System.out.println("NO");
			}else {
				for(String s : list) {
					System.out.println(s);
				}
			}
	}

}
