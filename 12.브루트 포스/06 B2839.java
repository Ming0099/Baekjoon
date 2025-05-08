import java.util.Scanner;
public class B2839 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int three = N/3+1;
        int five = N/5+1;
        int min = N;
        for(int i=0; i<five; i++){
            for(int j=0; j<three; j++){
                if(i*5 + j*3 == N){
                    if(min > i+j){
                        min = i+j;
                    }
                }
            }
        }
        if(min == N){
            min = -1;
        }
        System.out.println(min);
    }
}