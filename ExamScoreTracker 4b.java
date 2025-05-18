import java.util.Scanner;

public class ExamScoreTracker {
    public static void main(String[] args){
        final int num=5;
        int[] examscore=new int[num];

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the exa, scores of each student");

        for (int i=0; i<num; i++){
            System.out.print("Enter score for student"+ (i+1)+ ": ");
            examscore[i]=scanner.nextInt();
        }
        int sum=0;
        int highscore=examscore[0];

        for (int score: examscore){
            sum+=score;
            if (score>highscore){
                highscore=score;
            }

        }
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Highest score attained: " + highscore);

        scanner.close();
    }
}
