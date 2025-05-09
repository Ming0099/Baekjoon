import java.util.*;
public class B10815 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            map.put(scanner.nextInt(), 1);
        }

        int M = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int num;
        for(int i=0; i<M; i++){
            num = scanner.nextInt();
            if(map.containsKey(num)){
                sb.append(1 + " ");
            }else{
                sb.append(0 + " ");
            }
        }
        
        System.out.println(sb);
    }
}