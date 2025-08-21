import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float addition = num1 + num2;
        float subtraction = num1 - num2;
        float multiplication = num1 * num2;
        float division = num2 != 0 ? num1 / num2 : Float.NaN;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + String.format("%.2f", addition) + ", " + String.format("%.2f", subtraction) + ", " + String.format("%.2f", multiplication) + ", and " + String.format("%.2f", division));
    }
}
