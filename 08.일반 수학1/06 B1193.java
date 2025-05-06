import java.util.Scanner;
public class B1193 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int temp = 1;
        int i = 1;
        int i2 = 1;
        while(X>temp){
            temp += 1 + i++;
        }

        int tempI = i; // i 기억

        while(X != temp){
            i--;
            i2++;
            temp--;
        }
        
        String answer = tempI % 2 == 0 ? i + "/" + i2 : i2 + "/" + i;
        System.out.println(answer);
    }
}