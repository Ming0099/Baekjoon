import java.util.Scanner;
public class B5622 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(c >= 'W'){
                cnt += 10;
            }else if(c >= 'T'){
                cnt += 9;
            }else if(c >= 'P'){
                cnt += 8;
            }else if(c >= 'M'){
                cnt += 7;
            }else if(c >='J'){
                cnt += 6;
            }else if(c >= 'G'){
                cnt += 5;
            }else if(c >= 'D'){
                cnt += 4;
            }else if(c >= 'A'){
                cnt += 3;
            }
        }
        System.out.println(cnt);
    }
    
}
