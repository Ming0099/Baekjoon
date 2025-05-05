import java.util.Scanner;
public class B25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a, b;
        for(int i=0; i<N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            X -= a * b;
        }
        if(X == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}