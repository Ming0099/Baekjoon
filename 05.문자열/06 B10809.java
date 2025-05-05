import java.util.Scanner;
public class B10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ar[] = new int[26]; // a - 97
        for(int i=0; i<26; i++){
            ar[i] = -1;
        }
        for(int i=0; i<S.length(); i++){
            if(ar[(int)S.charAt(i) - 97] == -1)
                ar[(int)S.charAt(i) - 97] = i;
        }
        for(int i=0; i<26; i++){
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }
}