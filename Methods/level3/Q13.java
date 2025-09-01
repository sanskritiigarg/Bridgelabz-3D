import java.util.Random;
import java.util.Scanner;

public class Q13 {

    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            marks[i][0] = 40 + rand.nextInt(61); 
            marks[i][1] = 40 + rand.nextInt(61); 
            marks[i][2] = 40 + rand.nextInt(61); 
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][6]; 
      

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = marks[i][0];
            results[i][1] = marks[i][1];
            results[i][2] = marks[i][2];
            results[i][3] = total;
            results[i][4] = avg;
            results[i][5] = percent;
        }
        return results;
    }

    public static void displayScoreCard(double[][] results) {
        System.out.println("ID\tPhysics\tChem\tMath\tTotal\tAverage\t\tPercent");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" +
                    (int) results[i][0] + "\t" +
                    (int) results[i][1] + "\t" +
                    (int) results[i][2] + "\t" +
                    (int) results[i][3] + "\t" +
                    results[i][4] + "\t\t" +
                    results[i][5]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] results = calculateResults(marks);

        displayScoreCard(results);
    }
}