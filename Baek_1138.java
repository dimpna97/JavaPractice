package Baekjoon_Study;

import java.util.*;

public class Baek_1138 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			list.add(arr[i],i);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+1 + " ");
		}
		
	}

}
