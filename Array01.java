import java.util.*;

public class Array01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=n){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
