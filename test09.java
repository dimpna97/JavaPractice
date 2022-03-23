import java.util.Scanner;

public class test09 {
    
    public int solution(String s){
        String answer = "";
        answer = s.replaceAll("[^0-9]","");
        //System.out.println(s);
        // if(s.charAt(0)=='0'){
        //     for(int i=1;i<s.length();i++){
        //         answer += s.charAt(i);
        //     }     
        // }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        test09 T = new test09();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));
    }
}
