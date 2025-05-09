import java.util.*;
public class B18870 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int copyArr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = copyArr[i] = scanner.nextInt();
        }

        Arrays.sort(copyArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<N; i++){
            if(!map.containsKey(copyArr[i])){
                map.put(copyArr[i],count++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(map.get(arr[i]) + " ");
        }
        System.out.println(sb);
    }
}