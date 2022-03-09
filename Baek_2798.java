package WeekPractice;

import java.util.*;

public class Baek_2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		} //입력 받는거 까지 했음 
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					if(i!=j && j!=k && k!=i && arr[i]+arr[j]+arr[k]<=m) {
						list.add(arr[i]+arr[j]+arr[k]);
					}
				}
			}
		}
		System.out.print(list);
	}

}
