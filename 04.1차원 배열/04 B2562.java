import java.util.Scanner;
public class B2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        int max = -1;
        int cnt = 0;
        for(int i=0; i<9; i++){
            if(max < arr[i]){
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);
    }
}