import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade=new Grade();
        System.out.println("Type exam scores, -1 completes: ");
        int score;
        while(true){
            score=scanner.nextInt();
            if(score>=0 && score<=60)
                grade.addScore(score);
            if(score==-1)
                break;
        }
        
        grade.getGrade();
        grade.printGrades();
        System.out.println("Acceptance percentage: "+ grade.acceptanceRate());
    }
}
