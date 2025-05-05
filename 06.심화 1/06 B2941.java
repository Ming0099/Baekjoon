import java.util.Scanner;
public class B2941 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count=0;
        int i=0;
        while(s.length() > i){
            if(s.length() - i == 1){
                count++;
                break;
            }
            if(s.charAt(i) == 'c' && s.charAt(i+1) == '='){
                i+=2;
            }else if(s.charAt(i) == 'c' && s.charAt(i+1) == '-'){
                i+=2;
            }else if(s.charAt(i) == 'd' && s.charAt(i+1) =='-'){
                i+=2;
            }else if(s.charAt(i) == 'd' && s.charAt(i+1) == 'z'){
                if(s.length() - i > 2){
                    if(s.charAt(i+2) == '='){
                        i+=3;
                        count++;
                        continue;
                    }
                }
                i++;
            }else if(s.charAt(i) == 'l' && s.charAt(i+1) == 'j'){
                i+=2;
            }else if(s.charAt(i) == 'n' && s.charAt(i+1) == 'j'){
                i+=2;
            }else if(s.charAt(i) == 's' && s.charAt(i+1) == '='){
                i+=2;
            }else if(s.charAt(i) == 'z' && s.charAt(i+1) == '='){
                i+=2;
            }else{
                i++;
            }
            count++;
        }

        System.out.println(count);
    }
}