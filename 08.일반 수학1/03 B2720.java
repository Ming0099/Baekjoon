import java.util.Scanner;
public class B2720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int arr[][] = new int[T][4];
        int coin[] = {25, 10, 5, 1};
        int C;

        for(int i=0; i<T; i++){
            C = scanner.nextInt();
            for(int j=0; j<4; j++){
                arr[i][j] = C / coin[j];
                C -= arr[i][j] * coin[j];
            }
            
        }

        for(int i=0; i<T; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}