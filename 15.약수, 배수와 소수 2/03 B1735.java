import java.util.*;
public class B1735 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A1 = scanner.nextInt();
        int B1 = scanner.nextInt();
        int A2 = scanner.nextInt();
        int B2 = scanner.nextInt();
        int answerA = A1 * B2 + A2 * B1;
        int answerB = B1 * B2;
        int gcd = GCD(answerA, answerB);
        System.out.println(answerA/gcd + " " + answerB/gcd);
    }

    public static int GCD(int A, int B){
        if(A % B == 0){
            return B;
        }else{
            return GCD(B, A%B);
        }
    }
}