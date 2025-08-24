import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // While loop method
            int i = 1;
            int loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both results match");
            } else {
                System.out.println("Results do not match");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
