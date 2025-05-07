import java.util.Scanner;
public class B2501 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int count = 0;
        int answer = 0;
        for(int i=1; i<=N; i++){
            if(N % i == 0){
                count++;
                answer = i;
                if(count == K){
                    break;
                }
            }
        }

        if(count != K){
            answer = 0;
        }

        System.out.println(answer);
    }
}