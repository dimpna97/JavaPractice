import java.util.*;

public class Array03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arrA[] = new int[n];
        for(int i=0;i<arrA.length;i++){
            arrA[i] = scan.nextInt();
        }
        int arrB[] = new int[n];
        for(int i=0;i<arrB.length;i++){
            arrB[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arrA[i]-arrB[i]==1){
                System.out.println("A");
            }else if(arrA[i]-arrB[i]<0 ||arrA[i]-arrB[i]>1){
                System.out.println("B");
            }else{
                System.out.println("D");
            }
        }
    }
}
