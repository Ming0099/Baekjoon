import java.util.*;
public class B1269 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        HashSet<Integer> A = new HashSet<>();
        for(int i=0; i<N; i++){
            A.add(scanner.nextInt());
        }

        int count = 0; // 겹치는 개수
        int num;
        for(int i=0; i<M; i++){
            num = scanner.nextInt();
            if(A.contains(num)){
                count++;
            }
        }
        int AB = N - count;
        int BA = M - count;

        System.out.println(AB + BA);
    }
}