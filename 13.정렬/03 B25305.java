import java.util.*;
public class B25305 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int x[] = new int[N];
        for(int i=0; i<N; i++){
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[N-k]);
    }
}