package Baekjoon_Study;

import java.util.Scanner;

public class Baek_1475_G {

	public static void main(String[] args){
		// 아이디어
		// 0~9까지 배열을 만들고 사용한 숫자의 인덱스 값을 증가시킨다
		// 배열의 값 중 가장 큰 값이 사용한 세트의 수이다.

		// 0~9 까지 담을 배열(한 세트)
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		while (target > 0) {
			// 10으로 나눈 나머지의 값을 가져옴
			int tmp = target % 10;
			// 6이나 9는 호환 가능하니 작은 값을 증가
			// 여기서는 9를 증가시킴
			if (tmp == 6 || tmp == 9) {
				if (arr[6] >= arr[9]) {
					arr[9]++;
				} else {
					arr[6]++;
				}
				// 그게 아니면 사용한 값을 증가
			} else {
				arr[tmp]++;
			}
			// 10으로 나누어서 target값 초기화
			target /= 10;
		}
		// 최대값 구할 변수 초기화
		int maxV = 0;
		// 최대값이 나오면 바꿔주기
		for (int i = 0; i < 10; i++) {
			if (maxV < arr[i]) {
				maxV = arr[i];
			}
		}
		System.out.println(maxV);

	}

}
