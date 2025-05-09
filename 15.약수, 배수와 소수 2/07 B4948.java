import java.util.*;
public class B4948 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count;
        while(n != 0){
            count = 0;
            for(int i=n+1; i<=n*2; i++){
                if(isPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
            n = scanner.nextInt();
        }
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}