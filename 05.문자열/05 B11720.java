import java.util.Scanner;
public class B11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
        sc.close();
    }
}