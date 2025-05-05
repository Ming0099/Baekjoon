import java.util.Scanner;
public class B2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int time = (A*60 + B + C)%1440;
        System.out.println(time/60 + " " + time%60);
    }
}