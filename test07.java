import java.util.*;

public class test07 {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            return "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
       test07 T = new test07();
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       System.out.println(T.solution(str));
    }
}
