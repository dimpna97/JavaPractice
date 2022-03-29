import java.util.*;

public class Array04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
