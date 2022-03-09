package Baekjoon_Study;

public class abcd {

	public static void main(String[] args) {
		String test = "AA,BB,CC,,EE,FF,";
		String[] testArray = test.split(",", -1);
		for(int i = 0; i < testArray.length; i++){
			System.out.println(testArray[i]);
		}


	}

}
