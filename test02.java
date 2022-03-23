import java.util.Scanner;

class test02 {
    public String solution(String str){
        String answer="";
        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;

    }


    public static void main(String[] args) {
        test02 T = new test02();
        Scanner scan = new Scanner(System.in);
        String str = scan.next ();
        System.out.print(T.solution(str));
    }


}
