import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula
            int formulaSum = n * (n + 1) / 2;

            // For loop sum
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

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
