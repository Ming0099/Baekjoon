import java.util.*;
public class B17103 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        // 해시로도 되지만 느리고 메모리 많이 잡아먹음
        //HashSet<Integer> map = new HashSet<>();
        boolean arr[] = new boolean[1000001];
        for(int i=2; i<=1000000; i++){
            if(isPrime(i)){
                arr[i] = true;
                //map.add(i);
            }
        }

        int n;
        int count;
        for(int i=0; i<T; i++){
            n = scanner.nextInt();
            count = 0;
            for(int j=2; j<=n/2; j++){
                if(arr[j] && arr[n-j]){
                    count++;
                }
                /* 
                if(map.contains(j) && map.contains(n-j)){
                    count++;
                }*/
            }
            System.out.println(count);
        }
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}