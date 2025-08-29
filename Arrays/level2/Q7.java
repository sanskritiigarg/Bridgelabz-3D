import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];  
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            double weight;
            do {
                System.out.print("Weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Invalid input! Please enter a positive weight.");
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Height (m): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Invalid input! Please enter a positive height.");
            } while (height <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n----- BMI Report -----");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}