import java.util.Scanner;
public class B10813 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ar[] = new int[N];
        for(int a=0; a<N; a++){
            ar[a] = a+1;
        }
        int i,j,tmp;
        for(int a=0; a<M; a++){
            i = sc.nextInt();
            j = sc.nextInt();
            tmp = ar[i-1];
            ar[i-1] = ar[j-1];
            ar[j-1] = tmp;
        }
        for(int a=0; a<N; a++){
            System.out.print(ar[a] + " ");
        }
    }
}