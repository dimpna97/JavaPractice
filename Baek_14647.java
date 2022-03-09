package WeekPractice;

import java.util.*;

public class Baek_14647 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr[][] = new int[n][m];
		int hang[] = new int[n];
		int yeol[] = new int[m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
				while(arr[i][j]!=0) {
					if(arr[i][j] % 10 == 9) {
						hang[i]++;
						yeol[j]++;
						arr[i][j] /= 10;
					}else arr[i][j] /= 10;
				}
			}
		}
		Arrays.sort(hang);
		Arrays.sort(yeol);
		
		int sum = 0;
		if(hang[hang.length-1]>=yeol[yeol.length-1]) {
			for(int i=0;i<hang.length-1;i++) {
				sum += hang[i];
			}
			System.out.println(sum);
		}else {
			for(int i=0;i<yeol.length-1;i++) {
				sum += yeol[i];
			}
			System.out.print(sum);
			
		}
		
		
		
	}

}
