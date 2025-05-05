import java.util.Scanner;
public class B10807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ar[] = new int[N];
        for(int i=0; i<N; i++){
            ar[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            if(v == ar[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}