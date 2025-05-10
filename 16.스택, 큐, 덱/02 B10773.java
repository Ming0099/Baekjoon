import java.util.*;
public class B10773 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int n;
        for(int i=0; i<K; i++){
            n = scanner.nextInt();
            if(n == 0){
                stack.pop();
            }else{
                stack.push(n);
            }
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}