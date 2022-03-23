import java.util.Scanner;

class test01{

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        test01 T = new test01();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.print(T.solution(str, c));   
}

}

