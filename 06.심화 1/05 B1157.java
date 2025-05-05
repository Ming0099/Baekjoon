import java.util.Scanner;
public class B1157 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toUpperCase();
        int alpa[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            alpa[(int)s.charAt(i)-65]++;
        }

        int bigCount = 0;
        int alpaIndex = -1;
        int sameCount = 0;
        for(int i=0; i<26; i++){
            if(bigCount != 0 && bigCount == alpa[i]){
                sameCount++;
            }
            if(alpa[i] > bigCount){
                bigCount = alpa[i];
                alpaIndex = i;
                sameCount = 0;
            }
        }

        char answer;
        if(sameCount != 0){
            answer = '?';
        }else{
            answer = (char)(alpaIndex+65);
        }
        System.out.println(answer);
    }
}