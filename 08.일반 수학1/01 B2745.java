import java.util.Scanner;
public class B2745 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        long answer = 0;
        int temp = 0;

        for(int i=0; i<N.length(); i++){
            temp = (int)N.charAt(i);
            // A ~ Z 일 경우 - 55 / 0 ~ 9 일 경우 - 48
            temp = temp >= 65 ? temp - 55 : temp - 48;
            answer += temp * Math.pow(B, N.length()-i-1);
        }

        System.out.println(answer);
    }
}