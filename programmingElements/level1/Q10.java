import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        double heightInches = height / 2.54;

        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + Math.round(inches));
    }
}
