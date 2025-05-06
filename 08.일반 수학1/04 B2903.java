import java.util.Scanner;
public class B2903 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int p = 2;
        for(int i=0; i<N; i++){
            p += p - 1;
        }
        System.out.println(p * p);
    }
}