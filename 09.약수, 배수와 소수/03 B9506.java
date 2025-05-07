import java.util.Scanner;
public class B9506 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        int sum;
        while(true){
            n = scanner.nextInt();
            if(n == -1) break;
            s = "";
            sum = 0;

            for(int i=1; i<n; i++){
                if(n % i == 0){
                    sum += i;
                    s += i + " + ";
                }
            }

            if(n == sum){
                s = " = " + s.substring(0, s.length()-3);
            }else{
                s = " is NOT perfect.";
            }

            System.out.println(n + s);
        }
    }
}