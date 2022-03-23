import java.util.Scanner;

class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //scan.next();
        for(int i=0;i<n;i++){
            String s = scan.next();
            String answer = new StringBuilder(s).reverse().toString();
            System.out.println(answer);
        }
    }
}
