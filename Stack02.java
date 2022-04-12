import java.util.*;

public class Stack02 {
    public String solution(String s){
        String answer = "";
        char arr[] = s.toCharArray();
        Stack<Character> ST = new Stack<>();
        int cnt1 = 0; int cnt2 = 0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]=='(') cnt1++;
          else if(arr[i]==')') cnt2++;
          if(cnt1==cnt2 && arr[i]!=')' &&arr[i]!='('){
              ST.add(arr[i]);
          }
        }
        for(int i=0;i<ST.size();i++){
            answer += ST.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Stack02 T = new Stack02();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(T.solution(s));
    }    
}
