import java.util.*;
public class B14425 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        HashSet<String> map = new HashSet<>();
        for(int i=0; i<N; i++){
            map.add(scanner.next());
        }

        int count = 0;
        for(int i=0; i<M; i++){
            if(map.contains(scanner.next())){
                count++;
            }
        }

        System.out.println(count);
    }
}