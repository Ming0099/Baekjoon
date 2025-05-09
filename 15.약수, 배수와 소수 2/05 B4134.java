import java.util.*;
public class B4134 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        long n;
        for(int i=0; i<T; i++){
            n = scanner.nextLong();
            while(!isPrime(n)){
                n++;
            }
            System.out.println(n);
        }
    }

    public static boolean isPrime(long n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}