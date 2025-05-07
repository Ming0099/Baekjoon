import java.util.Scanner;
public class B10101 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String answer;
        if(a + b + c != 180){
            answer = "Error";
        }else{
            if(a == b && a == c){
                answer = "Equilateral";
            }else if(a == b || a == c || b == c){
                answer = "Isosceles";
            }else{
                answer = "Scalene";
            }
        }

        System.out.println(answer);
    }
}