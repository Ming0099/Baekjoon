import java.util.Scanner;
public class B25206 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String course;
        float credit;
        String grade;
        float gradeNum = 0f;
        float creditCount = 0f;
        float score = 0f;
        for(int i=0; i<20; i++){
            course = scanner.next();
            credit = scanner.nextFloat();
            grade = scanner.next();
            if(grade.equals("P")){
                continue;
            }
            switch (grade) {
                case "A+":
                    gradeNum = 4.5f;
                    break;
                case "A0":
                    gradeNum = 4f;
                    break;
                case "B+":
                    gradeNum = 3.5f;
                    break;
                case "B0":
                    gradeNum = 3f;
                    break;
                case "C+":
                    gradeNum = 2.5f;
                    break;
                case "C0":
                    gradeNum = 2f;
                    break;
                case "D+":
                    gradeNum = 1.5f;
                    break;
                case "D0":
                    gradeNum = 1f;
                    break;
                case "F":
                    gradeNum = 0f;
                    break;
            }
            score += credit * gradeNum;
            creditCount += credit;
        }

        System.out.println(score/creditCount);
    }    
}