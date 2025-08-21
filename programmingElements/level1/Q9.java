import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + String.format("%.2f", discount) + " and final discounted fee is INR " + String.format("%.2f", finalFee));

    }
}
