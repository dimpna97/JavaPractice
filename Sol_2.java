package WeekPractice;

import java.util.*;

public class Sol_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer1 = "";
		String answer2 = "";
		String s = "910123-2149091";
		if(s.charAt(8)=='1'||s.charAt(8)=='2') {
			answer1 = "19" + s.charAt(0) + s.charAt(1);
		}else if(s.charAt(8)=='3'||s.charAt(8)=='4') {
			answer1 = "20" + s.charAt(0) + s.charAt(1);
		}
		if(s.charAt(8)=='1'||s.charAt(8)=='3') {
			answer2 = "\"M\"";
		}else if(s.charAt(8)=='2'||s.charAt(8)=='4') {
			answer2 = "\"F\"";
		}
		System.out.print(answer1 + "/" + answer2);
	}

}
