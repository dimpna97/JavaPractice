import java.util.*;
public class Stack03 {
    
    public int solution(int n, int m, int arr[][], int moves[]){
       int answer = 0;
       Stack<Integer> st = new Stack<Integer>();
       for(int i=0;i<moves.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j][moves[i]-1]!=0){
                    if(st.isEmpty()){ //비어있으면 값을 추가해준다
                        st.push(arr[j][moves[i]-1]);    
                    }else{
                        if(st.peek()==arr[j][moves[i]-1]){ //만약 맨 마지막에 넣은 값과 넣을 값이 같다면 그 값은 없애주라, 그리고 없앤거 답에 추가로 해줘야함
                            st.pop();
                            answer +=2;
                        }else{
                            st.add(arr[j][moves[i]-1]); //아니면 그걸 그냥 추가해줘
                        }
                    }
                    arr[j][moves[i]-1]=0;   //추가한 다음에는 그 값을 0으로 만들어줘
                    break;
                }         
            }                
       }      
       System.out.println(st);      
       return answer;
    }

    public static void main(String[] args) {
        Stack03 T = new Stack03();
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
        System.out.println(T.solution(m,n,arr,moves));

    }
}
