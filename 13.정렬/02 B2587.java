import java.util.*;
public class B2587 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        
        int sum = 0;
        for(int i=0; i<5; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}