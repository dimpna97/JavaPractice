import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int cnt = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
