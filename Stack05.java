import java.util.*;

public class Stack05 {

    public int solution(String s){
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push('(');
            else{ //닫는 괄호임
                st.pop();
                if(s.charAt(i-1)=='('){
                    answer += st.size();
                }else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Stack05 T = new Stack05();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(T.solution(s));
    }

}
