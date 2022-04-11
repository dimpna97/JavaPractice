import java.util.*;

public class Pointers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int max = 0;
        for(int i=0;i<n-m+1;i++){
            int a = 0;
            for(int j=0;j<m;j++){
             a += arr[j+i];
                if(max < a){
                    int temp = max;
                    max = a;
                    a = temp;
                }
            }
        }
        System.out.println(max);        
    }
}
