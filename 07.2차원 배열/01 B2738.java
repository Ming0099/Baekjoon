import java.util.Scanner;
public class B2738 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int arr[][] = new int[N][M];
        int arr2[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr2[i][j] = arr[i][j] + scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
