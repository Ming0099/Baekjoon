import java.util.Scanner;
public class B3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[42];
        for(int i=0; i<10; i++){
            ar[sc.nextInt()%42]++;
        }
        int count = 0;
        for(int i=0; i<42; i++){
            if(ar[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}