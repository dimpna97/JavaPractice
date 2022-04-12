import java.util.*;

public class Stack01_01 {
    public String solution(String s){
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(x=='(') st.push(x);
            else{
                if(st.isEmpty()) return "NO";
                st.pop();
            }
        }
        if(!st.isEmpty()) return "NO"; //'('가 많이 있는 경우
        return answer;
    }
    public static void main(String[] args) {
        Stack01_01 T = new Stack01_01();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(T.solution(s));
    }
}
