import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the number b: ");
        double b = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        switch(op) {
            case "+":
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            case "-":
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            case "*":
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            case "/":
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

        sc.close();
    }
}
