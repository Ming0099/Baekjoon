import java.util.*;
public class B10816 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int num;
        for(int i=0; i<N; i++){
            num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int M = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            num = scanner.nextInt();
            sb.append(map.getOrDefault(num, 0) + " ");
        }
        System.out.println(sb);
    }
}