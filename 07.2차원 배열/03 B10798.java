import java.util.Scanner;
public class B10798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s[] = new String[5];
        int len[] = new int[5];
        int maxLen = -1;
        for(int i=0; i<5; i++){
            s[i] = scanner.nextLine();
            len[i] = s[i].length();
            maxLen = len[i] > maxLen ? len[i] : maxLen;
        }

        for(int i=0; i<maxLen; i++){
            for(int j=0; j<5; j++){
                if(len[j] > i){
                    System.out.print(s[j].charAt(i));
                }
            }
        }
    }
}