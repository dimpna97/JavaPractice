package algo;

import java.util.*;

public class Baek_3034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int t = 0;
		t = w*w + h*h;
		int tt = (int) Math.sqrt(t);
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]==w || arr[i]==h || arr[i]==tt) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
	}

}
