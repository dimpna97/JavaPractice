import java.util.*;
public class Stack01 {

    public String solution(String s){
        String answer = "";
        char arr[] = s.toCharArray();
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                cnt++;
            }else{
                cnt--;
            }
        }
        if(cnt==0) answer = "YES";
        else answer = "NO";

        return answer;    
    }
    public static void main(String[] args) {
        Stack01 T = new Stack01();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(T.solution(s));
    }
}
