package study;

import java.util.*;

public class Baek_7696 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		int arr[] = new int[n];
		int idx = 1;
		
		for (int i = 0; i < n; i++) {
			arr[i] = idx;
			idx++;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while(idx>0) {
				list.add(i%10);
			}
			
			for(int j=0;j<list.size();j++) {
				if(j+1<list.size() && list.get(j)==list.get(j+1)) {
					continue;
				}
			}
			
			System.out.print(list);
			//if (idx % 10 == idx / 10) {
			//	idx++;
			//}
			//System.out.print(arr[i] + " ");
		}
		//System.out.print(arr[n - 1]);
	}

}
