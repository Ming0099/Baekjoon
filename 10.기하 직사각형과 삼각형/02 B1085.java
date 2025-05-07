import java.util.Scanner;
public class B1085 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int minX = w - x > x - 0 ? x - 0 : w - x; 
        int minY = h - y > y - 0 ? y - 0 : h - y;
        int answer = minX > minY ? minY : minX;

        System.out.println(answer);
    }
}