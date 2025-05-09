import java.util.*;
public class B1764 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        HashSet<String> map = new HashSet<>();
        String name;
        for(int i=0; i<N; i++){
            name = scanner.next();
            map.add(name);
        }

        ArrayList<String> arr = new ArrayList<>();
        int count = 0;
        for(int i=0; i<M; i++){
            name = scanner.next();
            if(map.contains(name)){
                arr.add(name);
                count++;
            }
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(count + "\n");
        for(String s : arr){
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}