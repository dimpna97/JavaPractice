import java.util.*;

public class Pointers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += j;
                if(sum==n) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
