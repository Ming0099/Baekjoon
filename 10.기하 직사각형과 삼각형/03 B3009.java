import java.util.Scanner;
public class B3009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x[] = new int[3];
        int y[] = new int[3];

        for(int i=0; i<3; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int ax = x[0];
        if(x[0] == x[1]){
            ax = x[2];
        }else if(x[0] == x[2]){
            ax = x[1];
        }

        int ay = y[0];
        if(y[0] == y[1]){
            ay = y[2];
        }else if(y[0] == y[2]){
            ay = y[1];
        }

        System.out.println(ax + " " + ay);
    }
}