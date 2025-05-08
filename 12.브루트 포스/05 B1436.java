import java.util.Scanner;
public class B1436 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int answer = 666;
        
        while (count != N) {
            answer++;
            if (String.valueOf(answer).contains("666")) {
                count++;
            }
        }
        
        System.out.println(answer);
    }
}