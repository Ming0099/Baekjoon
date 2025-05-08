import java.util.Scanner;
public class B2798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        int answer = 0;
        int temp = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int z=j+1; z<N; z++){
                    temp = arr[i] + arr[j] + arr[z];
                    if(temp > answer && temp <= M){
                        answer = temp;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}