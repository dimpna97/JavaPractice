import java.util.*;

public class Stack03_02 {
    public int solution(int arr[][], int moves[]){
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int pos : moves){
            for(int i=0;i<arr.length;i++){
                if(arr[i][pos-1]!=0){
                    int tmp = arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if(!st.isEmpty() && tmp==st.peek()){
                        answer +=2;
                        st.pop();
                    }else{
                        st.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Stack03_02 T = new Stack03_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int moves[] = new int[m];
        for(int i=0;i<m;i++){
            moves[i] = scan.nextInt();
        }
        System.out.println(T.solution(arr,moves));

    }
}