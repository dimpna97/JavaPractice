package study;

import java.util.*;

public class Baek_17103 {

	/*
	소수구하기
	for(int i=2;i<=n;i++){
		boolean isPrime = true;
		for(int j=2;j*j<=i;j++){
			if(i%j==0){
				isPrime = false;
				break;
			} 
	} 
	
	if(isPrime){
		System.out.print(i+ " ");
	}
	
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//소수 구하기 > 소수는 false 
		boolean num[] = new boolean[1000001];
		num[0] = true;
		num[1] = true;
		
		for(int i=2;i*i<1000001;i++) {
			if(!num[i]) { //소수를 찾으면 
				for(int j = i*2;j<1000001;j+=i) {
					num[j] = true; //그 배수들은 소수 아니다. 
				}
			}
		}
		
		
		int t = scan.nextInt();
		for(int i=0;i<t;i++) {
			int a = scan.nextInt();
			int answer = 0;
			
			for(int j=2;j<=a/2;j++) {
				if(!num[j] && !num[a-j]) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}

}
