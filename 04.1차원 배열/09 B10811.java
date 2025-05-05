import java.util.Scanner;
public class B10811 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ar[] = new int[N];
        for(int i=0; i<N; i++){
            ar[i] = i+1;
        }

        int start, end, end_j, temp;
        for(int i=0; i<M; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            end_j = end-1;
            for(int j=start-1; j<(end+start)/2; j++){
                temp = ar[j];
                ar[j] = ar[end_j];
                ar[end_j] = temp;
                end_j--;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(ar[i] + " ");
        }
    }
}