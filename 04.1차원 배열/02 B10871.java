import java.util.Scanner;
public class B10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int ar[] = new int[N];
        for(int i=0; i<N; i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            if(X>ar[i]){
                System.out.print(ar[i] + " ");
            }
        }
    }
}