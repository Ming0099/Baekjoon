import java.util.ArrayList;
import java.util.Scanner;
public class B1316 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s;
        char preChar;
        int count = n;
        boolean b = false;
        ArrayList<Character> ch = new ArrayList<Character>();
        for(int i=0; i<n; i++){
            s = scanner.next();
            preChar = s.charAt(0);
            ch.add(s.charAt(0));

            for(int j=0; j<s.length(); j++){
                if(preChar != s.charAt(j)){
                    for(int z=0; z<ch.size(); z++){
                        if(s.charAt(j) == ch.get(z)){
                            count--;
                            b = true;
                            break;
                        }
                    }
                    if(b){
                        break;
                    }
                    preChar = s.charAt(j);
                    ch.add(preChar);
                }
            }
            b = false;
            ch.clear();
        }

        System.out.println(count);
    }
}