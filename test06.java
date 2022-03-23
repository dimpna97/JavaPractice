import java.util.*;


public class test06 {
    public String solution(String str){
        String answer = "";
        for(int i=0;i<str.length();i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        test06 T = new test06();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));    
    
    
    
    }
}
