import java.util.*;

public class Pointers06_01 {
    public int solution(int n, int m, int[] arr){
        int answer = 0, cnt=0, lt=0;
        for(int rt=0;rt<n;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>m){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Pointers06_01 T = new Pointers06_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
