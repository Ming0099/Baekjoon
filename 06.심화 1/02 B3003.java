import java.util.Scanner;
public class B3003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pieces[] = new int[6];
        pieces[0] = 1;
        pieces[1] = 1;
        pieces[2] = 2;
        pieces[3] = 2;
        pieces[4] = 2;
        pieces[5] = 8;
        int n;
        for(int i=0; i<6; i++){
            n = scanner.nextInt();
            System.out.print(pieces[i] - n + " ");
        }
    }
    
}
