package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			list.add(words[i]);
		}
		String eng[] = new String[list.size()]; // 단어 1개씩 넣는 배열

		String s = "";
		for (int i = 0; i < list.size(); i++) {
			eng[i] = list.get(i); // 각각 단어 넣는 배열
			s = eng[i];
			int a = s.length(); // 단어 길이 
			System.out.print(s.charAt(0) + "\t" + s.charAt(a-1));
			
		}
	

	}

}
