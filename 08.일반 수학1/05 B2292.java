import java.util.Scanner;
public class B2292 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int temp = 1;
        int i = 1;

        while(N > temp){
            temp += 6 * i++;
        }

        System.out.println(i);
    }
}