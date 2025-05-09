import java.util.*;
public class B7785 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> map = new HashSet<>();
        String name, state;
        for(int i=0; i<n; i++){
            name = scanner.next();
            state = scanner.next();
            if(state.equals("enter")){
                map.add(name);
            }else{
                map.remove(name);
            }
        }

        ArrayList<String> arr = new ArrayList<>(map);
        Collections.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}