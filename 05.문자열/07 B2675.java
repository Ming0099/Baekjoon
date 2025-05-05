import java.util.Scanner;
public class B2675 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2;
        String s;
        for(int i=0; i<n; i++){
            n2 = scanner.nextInt();
            s = scanner.next();
            for(int j=0; j<s.length(); j++){
                for(int z=0; z<n2; z++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
    }
    
}
