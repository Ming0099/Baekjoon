import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");

            switch(s[0]){
                case "push" :
                    queue.add(Integer.parseInt(s[1]));
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(queue.peek() + "\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(queue.peekLast() + "\n");
                    }
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(queue.pop() + "\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}