import java.util.Scanner;
public class B1152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char pre = ' ';
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(pre != ' '){
                if(s.charAt(i) == ' '){
                    cnt++;
                }
            }
            pre = s.charAt(i);
        }
        if(pre != ' '){
            if(s.length() != 0){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
    
}
