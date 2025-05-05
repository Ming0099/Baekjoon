import java.util.Scanner;
public class B2908 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        String rs1 = "", rs2 = "";

        for(int i=2; i>=0; i--){
            rs1 += s1.charAt(i);
            rs2 += s2.charAt(i);
        }
        
        int answer = Integer.parseInt(rs1);
        if(Integer.parseInt(rs2) > answer){
            answer = Integer.parseInt(rs2);
        }

        System.out.println(answer);
    }
}
