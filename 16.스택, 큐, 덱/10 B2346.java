import java.util.*;
public class B2346 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<int[]> arrayList = new ArrayList<>();
        for(int i=0; i<N; i++){
            arrayList.add(new int[] {i, scanner.nextInt()});
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        while(!arrayList.isEmpty()){
            int[] balloon = arrayList.remove(idx);
            sb.append(balloon[0]+1).append(" ");

            if (arrayList.isEmpty()) break;

            if(N == 1){
                break;
            }

            int move = balloon[1];
            N--;

            if (move > 0) {
                idx = (idx + (move - 1)) % N;
            } else {
                idx = (idx + move) % N;
                if (idx < 0) idx += N;
            }
        }

        System.out.print(sb.toString().trim());
    }
}