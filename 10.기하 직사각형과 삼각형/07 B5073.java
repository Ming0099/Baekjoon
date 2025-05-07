import java.util.Scanner;
public class B5073 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String answer;
        while(true){
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            answer = "";
            if(a == 0 && b == 0 && c == 0){
                break;
            }

            if(a - (b + c) >= 0 || b - (a + c) >= 0 || c - (a + b) >= 0){
                answer = "Invalid";
            }else{
                if(a == b && b == c){
                    answer = "Equilateral";
                }else if(a == b || b == c || a == c){
                    answer = "Isosceles";
                }else{
                    answer = "Scalene";
                }
            }
            System.out.println(answer);
        }
    }
}