import java.util.Scanner;
public class B11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;
        for(int i=0; i<T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}