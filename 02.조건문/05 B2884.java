import java.util.Scanner;
public class B2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = H*60 + M - 45;
        if(time<0){
            time += 1440;
        }
        System.out.println(time/60 + " " + time%60);
    }
}