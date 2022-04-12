import java.util.*;

public class Stack02_01 {
    public String solution(String s){
        String answer = "";
        Stack<Character> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(x==')'){
                while(st.pop()!='(');
            }else{
                st.push(x);
            }
        }
        for(int i=0;i<st.size();i++){
            answer += st.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Stack02_01 T = new Stack02_01();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(T.solution(s));
    }    
}
