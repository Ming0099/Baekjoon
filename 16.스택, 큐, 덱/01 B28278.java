import java.util.*;
public class B28278 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = scanner.nextInt();
        int n;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            n = scanner.nextInt();
            switch(n){
                case 1:
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    if(stack.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size() + "\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                case 5:
                    if(stack.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(stack.get(stack.size()-1) + "\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}