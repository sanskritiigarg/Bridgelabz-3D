import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (positive and less than 100): ");
        int number = sc.nextInt();


        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Number must be positive and less than 100.");
            return;
        }


        int counter = number - 1;

        System.out.println("The factors of " + number + " are:");

        while (counter > 1) {
            if (number % counter == 0) {  
                System.out.println(counter);
            }
            counter--;  
        }


        System.out.println(1);
        System.out.println(number);
    }
}
