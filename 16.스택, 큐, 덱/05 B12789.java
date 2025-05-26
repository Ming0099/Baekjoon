import java.util.*;
public class B12789 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        int n = 1;
        for(int i=0; i<N; i++){
            if(arr[i] == n){
                n++;
            }else if(!stack.isEmpty() && stack.peek() == n){
                stack.pop();
                i--;
                n++;
            }else{
                stack.push(arr[i]);
            }
        }

        String answer = "Nice";
        while(!stack.isEmpty()){
            int item = stack.pop();
            if(item == n){
                n++;
            }else{
                answer = "Sad";
                break;
            }
        }

        System.out.println(answer);
    }
}