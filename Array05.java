import java.util.*;

public class Array05 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int arr[] = new int[n+1];
      int cnt = 0;

      for(int i=2;i<arr.length;i++){
          if(arr[i]==0){
              cnt++;
          }
          for(int j=i;j<arr.length;j+=i){
              arr[j] = 1;
          }
        
      }
      System.out.println(cnt);
  }  
}
