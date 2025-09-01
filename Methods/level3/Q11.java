import java.util.Random;

public class Q11 {

    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];  

        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = rand.nextInt(11);            
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3]; 

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void displayTable(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n", 
                          "ID", "OldSalary", "Years", "NewSalary", "Bonus", "Diff");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            totalOld += result[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][2];

            System.out.printf("%-5d %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n", 
                (i+1), result[i][0], data[i][1], result[i][1], result[i][2], result[i][1]-result[i][0]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL  %-10.2f %-10s %-10.2f %-10.2f\n", totalOld, "", totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] result = calculateBonus(employeeData);
        displayTable(employeeData, result);
    }
}