package algo;

import java.util.Scanner;

public class Ddakji {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int j = 0; j < n; j++) {
			int a = scan.nextInt();
			int A[] = new int[a];
			for (int i = 0; i < a; i++) {
				A[i] = scan.nextInt();
			}
			
			int b = scan.nextInt();
			int B[] = new int[b];
			for (int i = 0; i < b; i++) {
				B[i] = scan.nextInt();
			}
			
			int cnt = 0;
			for(int i=4;i>0;i--) {
				int cntA = 0;
				int cntB = 0;
				
				for(int k=0;k<A.length;k++) {
					if(A[k]==i) {
						cntA++;
					}
				}
				
				for(int k=0;k<B.length;k++) {
					if(B[k]==i) {
						cntB++;
					}
				}
				if(cntA==cntB) {
					cnt++;
					continue;
				}
				
				if(cntA>cntB) {
					System.out.println("A");
					break;
				}
				else {
					System.out.println("B");
					break;
				}
				
			}
			if(cnt==4) {
				System.out.println("D");
			}
			
		}
	}

}
