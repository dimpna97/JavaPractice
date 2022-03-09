package WeekPractice;

import java.util.*;

public class Sol_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[][] = {{2,7},{5,6},{13,15}};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i][0];j<arr[i][1];j++) {
				list.add(j);
			}
		}
		HashSet<Integer> set = new HashSet<Integer>(list);
		ArrayList<Integer> answer = new ArrayList<Integer>(set);
		System.out.print(answer.size());
	}

}
