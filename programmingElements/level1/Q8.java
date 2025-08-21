import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km;
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + String.format("%.2f", miles) + " mile for the given " + km + " km");
    }
}
