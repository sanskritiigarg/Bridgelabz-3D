import java.util.Scanner;

public class Q8 {
    public static void doubleOperation(double a, double b, double c) {
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;   

        System.out.println("The results of Double Operations are " + String.format("%.2f", op1) + ", " + String.format("%.2f", op2) + ", " + String.format("%.2f", op3) + ", and " + String.format("%.2f", op4));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        doubleOperation(a,b,c);
    }
}
