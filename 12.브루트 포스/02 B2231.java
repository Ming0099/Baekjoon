import java.util.Scanner;
public class B2231 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();

        int N = Integer.parseInt(s);
        int start = N - len * 9;

        int answer = 0;
        int num, sum;
        for(int i=start; i<N; i++){
            sum = i;
            num = i;

            while(num != 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum == N){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}