import java.util.Scanner;
public class B2566 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = -1;
        int x = -1, y = -1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = j;
                    y = i;
                }
            }
        }

        System.out.println(max);
        System.out.println((y+1) + " " + (x+1));
    }
}