import java.util.*;

public class Pointers03_01 {
    
    public int solution(int n,int k, int[] arr){
        int answer = 0, sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
            answer = sum;
        }
        for(int i=k;i<n;i++){
            sum +=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;    
    }
    public static void main(String[] args) {
        Pointers03_01 T = new Pointers03_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print(T.solution(n,k,arr));
    }    
}
