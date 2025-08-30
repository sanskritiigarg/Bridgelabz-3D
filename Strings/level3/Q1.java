import java.util.Scanner;

public class Q1 {
    public static String[] calculateBMIAndStatus(double weight, double height) {
        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);
        String status;
        
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        return new String[]{String.format("%.2f", bmi), status};
    }
    
    public static String[][] processPersonData(double[][] personData) {
        String[][] result = new String[personData.length][4];
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            
            String[] bmiResult = calculateBMIAndStatus(weight, height);
            
            result[i][0] = String.format("%.1f", height);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }
        
        return result;
    }
    
    public static void displayResults(String[][] results) {
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%-8s %-12s %-10s %-8s %-12s%n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("=".repeat(60));
        
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-8d %-12s %-10s %-8s %-12s%n", 
                (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
        
        System.out.println("=".repeat(60));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        System.out.println("Enter weight and height data for 10 persons:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        String[][] results = processPersonData(personData);
        displayResults(results);
        
        scanner.close();
    }
}