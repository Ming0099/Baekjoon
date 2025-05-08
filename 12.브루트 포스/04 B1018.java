import java.util.Scanner;
public class B1018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.next();
        }

        int min = N * M;
        int temp = 0;
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                temp = count(arr,i,j);
                if(min > temp){
                    min = temp;
                }
            }
        }

        System.out.println(min);
    }

    public static int count(String[] arr, int x, int y){
        char[] c = {'W','B'};
        int startW = 0;
        int startB = 0;
        int index = 0;

        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i].charAt(j) != c[index%2]){
                    startW++;
                }
                if(arr[i].charAt(j) != c[(index+1)%2]){
                    startB++;
                }
                index++;
            }
            index++;
        }

        return startW > startB ? startB : startW;
    }
}