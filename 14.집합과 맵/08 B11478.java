import java.util.*;
public class B11478 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        HashSet<String> map = new HashSet<>();
        for(int i=0; i<S.length(); i++){
            for(int j=0; j<S.length()-i; j++){
                map.add(S.substring(j,j+i+1));
            }
        }
        System.out.println(map.size());
    }
}