import java.util.*;
public class B13241 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextInt();
        long B = scanner.nextInt();
        long temp;
        if(B>A){
            temp = A;
            A = B;
            B = temp;
        }
        long gcd = GCD(A,B);
        System.out.println(A*B/gcd);
    }

    public static long GCD(long A, long B){
        if(A % B == 0){
            return B;
        }else{
            return GCD(B, A%B);
        }
    }
}