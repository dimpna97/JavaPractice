import java.util.*;

class test04_01 {
    
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
  
    public static void main(String[] args) {
      test04_01 T = new test04_01();
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      String [] str = new String[n];
      for(int i=0;i<n;i++){
          str[i] = scan.next();
      }
      for(String x : T.solution(n, str)){
          System.out.println(x);
      }
  }  
}
