import java.util.*;
public class B9012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            String str = scanner.next();
            isValid = true;

            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                }else{
                    if(stack.size() == 0){
                        isValid = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            
            if(isValid && stack.size() == 0){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
            stack.clear();
        }

        System.out.print(sb);
    }
}