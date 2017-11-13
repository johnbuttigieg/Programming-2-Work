public class Billing
{

    final static double TAX = 0.08;


    public static void main(String[] args)
    {
        double bill;


        bill = computeBill(50);
        System.out.println("A photobook that costs $24.99 is $" + bill);


        bill = computeBill(10, 5);
        System.out.println("5 photobooks cost $17.50 is $" + bill);


        bill = computeBill(10.00, 10, 20.00);
        System.out.println("10 photobooks cost $10.00 with a $20 coupon is $" + bill);
    }

    public static double computeBill(double price)
    {
        double bill = price + price * TAX;
        return bill;
    }

    public static double computeBill(double price, int quantity)
    {
        double bill = price * quantity;
        bill = bill + bill * TAX;
        return bill;

    }
    public static double computeBill(double price, int quantity, double coupon)
    {
        double bill = price * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}