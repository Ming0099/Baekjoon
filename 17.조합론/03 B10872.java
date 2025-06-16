import java.util.*;
public class B10872 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = 1;
        for(int i=1; i<=N; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}