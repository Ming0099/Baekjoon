import java.util.*;
public class B2485 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        int gcd = arr[1] - arr[0];
        for(int i=2; i<N; i++){
            gcd = GCD(arr[i] - arr[i-1], gcd);
        }

        System.out.println((arr[N-1] - arr[0])/gcd - N + 1);
    }

    public static int GCD(int A, int B){
        if(A%B==0){
            return B;
        }else{
            return GCD(B, A%B);
        }
    }
}