import java.util.*;

public class Queue03 {
    public String solution(String a, String b){
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for(char x : a.toCharArray()) q.offer(x);
        for(char x: b.toCharArray()){
            if(q.contains(x)){
                if(x!=q.poll()) return "NO"; //첫번째 것이 아니면 no를 리턴 , 순서대로 움직여야 하니까
            }
        }
        if(!q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Queue03 T = new Queue03();
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(T.solution(a,b));
    }    
}
