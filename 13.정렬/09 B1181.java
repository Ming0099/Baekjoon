import java.util.*;
public class B1181 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s[] = new String[N];
        for(int i=0; i<N; i++){
            s[i] = scanner.next();
        }

        Arrays.sort(s, (a,b) ->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }else{
                return a.length() - b.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(s[0]).append("\n");
        for(int i=1; i<N; i++){
            if(!s[i].equals(s[i-1])){
                sb.append(s[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}