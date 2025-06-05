import java.util.*;
public class B28279 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            int x = scanner.nextInt();
            switch(x){
                case 1:
                    deque.offerFirst(scanner.nextInt());
                    break;
                case 2:
                    deque.offerLast(scanner.nextInt());
                    break;
                case 3:
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(deque.pollFirst());
                    }
                    sb.append("\n");
                    break;
                case 4:
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(deque.pollLast());
                    }
                    sb.append("\n");
                    break; 
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()){
                        sb.append(1);
                    }else{
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case 7:
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(deque.peekFirst());
                    }
                    sb.append("\n");
                    break;
                case 8:
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(deque.peekLast());
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
