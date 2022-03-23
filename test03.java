import java.util.Scanner;

class test03 {

    private static String solution;
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len>m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        test03 T = new test03();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        solution = T.solution(str);
        System.out.print(solution);
    }    
}
