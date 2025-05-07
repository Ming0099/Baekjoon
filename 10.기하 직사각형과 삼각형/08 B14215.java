import java.util.Scanner;
public class B14215 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if(a - (b + c) >= 0){
            a -= a - (b + c) + 1;
        }else if(b - (a + c) >= 0){
            b -= b - (a + c) + 1;
        }else if(c - (a + b) >= 0){
            c -= c - (a + b) + 1;
        }

        System.out.println(a + b + c);
    }
}