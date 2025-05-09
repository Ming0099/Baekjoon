import java.util.*;
public class B1620 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reMap = new HashMap<>();
        String name;
        for(int i=1; i<=N; i++){
            name = scanner.next();
            map.put(name, i);
            reMap.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            name = scanner.next();
            if(name.charAt(0) - '0' > 9){
                sb.append(map.get(name) + "\n");
            }else{
                sb.append(reMap.get(Integer.parseInt(name)) + "\n");
            }
        }
        System.out.print(sb);
    }
}