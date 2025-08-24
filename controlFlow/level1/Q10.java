import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
        }

        System.out.println("The sum is: " + total);
        sc.close();
    }
}

