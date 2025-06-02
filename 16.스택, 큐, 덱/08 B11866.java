import java.util.*;
public class B11866 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int idx = -1;
        while(!list.isEmpty()){
            idx += K;
            idx %= list.size();
            sb.append(list.get(idx) + ", ");
            list.remove(idx--);
        }

        String answer = sb.substring(0, sb.length()-2);
        System.out.print(answer + ">");
    }
}