import java.util.Scanner;
public class B2581 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;
        int min = 0;
        boolean isPrime = true;

        for(int i = M; i <= N; i++){
            if(i == 1)continue;
            isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
                if(min == 0){
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum + "\n" + min);
        }
    }
}