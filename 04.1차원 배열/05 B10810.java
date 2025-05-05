import java.util.Scanner;
public class B10810 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ar[] = new int[N];
        int i,j,k;
        for(int a=0; a<M; a++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int b=i-1; b<j; b++){
                ar[b] = k;
            }
        }

        for(int a=0; a<N; a++){
            System.out.print(ar[a] + " ");
        }
    }
}