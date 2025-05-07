import java.util.Scanner;
public class B5086 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n, n2;
        while(true){
            n = scanner.nextInt();
            n2 = scanner.nextInt();

            if(n == 0 && n2 == 0) break;

            if(n2 % n == 0){
                System.out.println("factor");
            }else if(n % n2 == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}