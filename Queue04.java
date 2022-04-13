import java.util.*;

class Person{
    int id; //0번째
    int priority; //순위
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Queue04 {

    public int solution(int n, int m, int arr[]){
        int answer = 0;
        Queue<Person> q = new LinkedList<>(); //Person을 저장할 수 있는 객체를 만든거임
        for(int i=0;i<arr.length;i++){
            q.add(new Person(i, arr[i])); //offer로 해도 됨
        }

        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x: q){
                if(x.priority>tmp.priority){
                    q.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
                
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Queue04 T = new Queue04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }    
}
