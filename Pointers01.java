import java.util.*;

public class Pointers01 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Integer> list = new ArrayList<Integer>();
            int n = scan.nextInt();
            int arr1[] = new int[n];
            for(int i=0;i<n;i++){
                arr1[i] = scan.nextInt();
                list.add(arr1[i]);
            }
            int m = scan.nextInt();
            int arr2[] = new int[m];
            for(int i=0;i<m;i++){
                arr2[i] = scan.nextInt();
                list.add(arr2[i]);
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }

    }
}
