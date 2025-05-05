import java.util.Scanner;
public class B9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String str;
        for(int i=0; i<T; i++){
            str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
        sc.close();
    }
}