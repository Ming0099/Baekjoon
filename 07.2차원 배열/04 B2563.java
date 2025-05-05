import java.util.Scanner;
public class B2563 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[100][100];
        int area = 0;
        int x, y;
        for(int i=0; i<n; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            for(int j=x; j<x+10; j++){
                for(int z=y; z<y+10; z++){
                    if(arr[j][z] == 0){
                        arr[j][z] = 1;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}