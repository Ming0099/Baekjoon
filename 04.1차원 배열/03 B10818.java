import java.util.Scanner;
public class B10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x;
        int min = 1000000;
        int max = -1000000;
        for(int i=0; i<N; i++){
            x = sc.nextInt();
            if(min > x){
                min = x;
            }
            if(max < x){
                max = x;
            }
        }
        System.out.println(min + " " + max);
    }
}