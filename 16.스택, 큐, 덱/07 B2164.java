import java.util.*;
public class B2164 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            queue.offer(i+1);
        }

        boolean trigger = false;
        while(queue.size() != 1){
            int item = queue.poll();
            if(trigger){
                queue.offer(item);
            }
            trigger = !trigger;
        }

        System.out.println(queue.peek());
    }
}