

public class Q4 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        
        int diff = sellingPrice - costPrice;
        String profitOrLoss = diff > 0 ? "profit" : "loss";

        double percentage = diff/(double)costPrice * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe " + profitOrLoss + " is " + diff + " and the percentage is " + Math.round(percentage));

    }
}