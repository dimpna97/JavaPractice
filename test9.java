package algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test9 {

	public static void main(String[] args) {
		int arr[][] = { { 2, 7 }, { 5, 6 }, { 8, 10 } };
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i][0]; j < arr[i][1]; j++) {
				list.add(j);
			}
			
		}
		Set <Integer> set = new HashSet <Integer>(list);
		List<Integer> newList = new ArrayList<Integer>(set);
		System.out.println(newList.size());
	}

}
