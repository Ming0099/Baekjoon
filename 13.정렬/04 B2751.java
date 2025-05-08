import java.util.*;
public class B2751 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            arr.add(scanner.nextInt());
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr.get(i)).append("\n");
        }
        
        System.out.println(sb);
    }
}