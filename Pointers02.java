import java.util.*;

public class Pointers02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = scan.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int arr2[] = new int [m];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
