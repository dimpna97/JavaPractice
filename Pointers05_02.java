import java.util.*;

public class Pointers05_02 {

    public int solution(int n){
        int answer = 0, cnt =1;
        n--;
        while(n>0){
            cnt++; //연속된 숫자를 생각하면 됨
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Pointers05_02 T  = new Pointers05_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
