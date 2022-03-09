package algo;

import java.util.*;

public class Baek_1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int result = 1;
			
			for(int j=0;j<b;j++) {
				result = (a * result)%10;
			} //math.pow함수 대신 쓴 거 
			
			
			if(result==0) {
				System.out.println(10);
			}else {
				System.out.println(result);
			}
		}

	}

}
