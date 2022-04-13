import java. util.*;

//퐁당퐁당 하겠다는 뜻
public class Queue02 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            for(int i=1;i<k;i++){
                q.offer(q.poll()); //값을 꺼내고 다시 넣는다
            }
            q.poll();
            if(q.size()==1) answer=q.poll();
        }

        return answer;
    }
    public static void main(String[] args) {
        Queue02 T = new Queue02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(T.solution(n,k));        
    }
}
