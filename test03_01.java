import java.util.Scanner;

class test03_01{
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m = len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }

        return answer;
    }
    public static void main(String[] args) {
    test03_01 T = new test03_01();
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.print(T.solution(str));        
    }

}