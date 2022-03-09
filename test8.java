package algo;

public class test8 {

	public static void main(String[] args) {
		String s = "910117-2150415";
		String gender = "";
		String year = "";

		char arr[] = s.toCharArray();
		switch(arr[7]) {
		case '1':
			gender = "M";
			year = "19" + arr[0] + arr[1];
			break;
		case '2':
			gender = "F";
			year = "19" + arr[0] + arr[1];
			break;
		case '3':
			gender = "M";
			year = "20" + arr[0] + arr[1];
			break;
		case '4':
			gender = "F";
			year = "20" + arr[0] + arr[1];
			break;
		}
		System.out.print(year + "/" + gender);
		

	}

}
