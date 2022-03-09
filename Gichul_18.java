package study;

import java.util.*;

public class Gichul_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i =1;i<=t;i++) {
			int n = scan.nextInt();
			int arr[] = new int[3]; // arr[0]=25,arr[1]=50,arr[2]=100 
			for(int j=0;j<n;j++) {
				int a  = scan.nextInt();
				if(a==25) {
					arr[0]++;
				}else if(a==50) {
					arr[1]++;
					arr[0]--;
				}else if(a==100) {
					arr[2]++;
					arr[1]--;
					arr[0]--;
				}
				if(arr[0]<0 || arr[1]<0 || arr[2]<0) break;
			}
			System.out.println("Case #" + i);
			if(arr[0]<0 || arr[1]<0 || arr[2]<0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
			
		}
	}

}
