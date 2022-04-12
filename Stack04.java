import java.util.*;

public class Stack04 {
    public int solution(String s){
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(char x: s.toCharArray()){
            if(Character.isDigit(x)) st.push(x-48);
            else{
                int rt = st.pop();
                int lt = st.pop();
                if(x=='+') st.push(lt+rt);
                else if(x=='-') st.push(lt-rt);
                else if(x=='*') st.push(lt*rt);
                else if(x=='/') st.push(lt/rt);
            }
        }
        answer = st.get(0);
        return answer;
    }
    public static void main(String[] args) {
        Stack04 T = new Stack04();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(T.solution(s));
    }    
}
