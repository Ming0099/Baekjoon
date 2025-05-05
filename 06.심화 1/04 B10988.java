import java.util.Scanner;
public class B10988 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int answer = 0;
        if(s.equals(sb.reverse().toString())){
            answer = 1;
        }
        System.out.println(answer);
    }
}