import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println("The distance of " + distanceInFeet + " feet is " + String.format("%.2f", distanceInYards) + " yards and " + String.format("%.2f", distanceInMiles) + " miles");
    }
}
