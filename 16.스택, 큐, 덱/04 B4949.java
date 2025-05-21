import java.util.*;
public class B4949 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = scanner.nextLine();
            if (str.equals(".")) break;

            Stack<String> stack = new Stack<>();

            String[] sentence = str.split("");
            for(String word : sentence){
                switch (word) {
                    case ("("):
                    case ("["):
                        stack.push(word);
                        break;
                    case (")"):
                        if(!stack.isEmpty() && stack.peek().equals("("))
                            stack.pop();
                        else stack.push(")");
                        break;
                    case ("]"):
                        if(!stack.isEmpty() && stack.peek().equals("["))
                            stack.pop();
                        else stack.push("]");
                        break;
                }
            }

            if (stack.empty()){
                sb.append("yes\n");
            }
            else{
                sb.append("no\n");
            }
        }
        
        System.out.print(sb);
    }
}