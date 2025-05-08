import java.util.*;
public class B1427 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        char[] arr = N.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}