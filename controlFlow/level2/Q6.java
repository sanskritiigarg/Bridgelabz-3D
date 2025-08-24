import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        // Find youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest.");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("Anthony is the youngest.");
        } else {
            System.out.println("They have same age.");
        }

        // Find tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest.");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest.");
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("Anthony is the tallest.");
        } else {
            System.out.println("They have same heights.");
        }

        sc.close();
    }
}
