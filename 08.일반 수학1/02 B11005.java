import java.util.Scanner;
public class B11005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();

        String s = "";
        int temp = 0;
        while(N > 0){
            temp = N % B;
            N /= B;

            temp = temp > 9 ? temp + 55 : temp + 48;
            s += (char)temp;
        }
        StringBuilder answer = new StringBuilder(s);

        System.out.println(answer.reverse());
    }
}