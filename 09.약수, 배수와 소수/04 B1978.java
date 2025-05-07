import java.util.Scanner;
public class B1978 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n;
        int count;
        int answer = 0;
        for(int i=0; i<N; i++){
            n = scanner.nextInt();
            count = 0;

            for(int j=1; j<=n; j++){
                if(n % j == 0){
                    count++;
                }
            }
            if(count == 2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}