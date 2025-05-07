import java.util.Scanner;
public class B9063 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x, y;
        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;
        
        for(int i=0; i<N; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(minX > x){
                minX = x;
            }
            if(maxX < x){
                maxX = x;
            }
            if(minY > y){
                minY = y;
            }
            if(maxY < y){
                maxY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}