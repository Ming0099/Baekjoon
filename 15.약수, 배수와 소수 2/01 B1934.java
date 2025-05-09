import java.util.*;
public class B1934 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int A, B;
        int temp;
        for(int i=0; i<T; i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            if(B > A){
                temp = A;
                A = B;
                B = temp;
            }
            int gcd = GCD(A,B);
            System.out.println(A * B / gcd);
        }
    }

    public static int GCD(int A, int B){
        if(A % B == 0){
            return B;
        }else{
            return GCD(B, A%B);
        }
    }
}