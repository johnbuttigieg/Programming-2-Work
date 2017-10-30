import java.util.Scanner;


public class MetricConversion
{
    public static void main (String args[])
    {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be converted from inches to centimeters and gallons to liters: ");
        number = input.nextInt();
        centimersConversion(number);
        litersConversion(number);
    }

    public static void centimersConversion(int inches)
    {
        double centimeters;
        final double CENTIMETER_CONVERT = 2.54;
        centimeters = inches * CENTIMETER_CONVERT;
        System.out.println(inches + " inches converts to " + centimeters + " centimeters");
    }


    public static void litersConversion(int gallons)
    {
        double liters;
        final double LITER_CONVERT = 3.7854;
        liters = gallons * LITER_CONVERT;
        System.out.println(gallons + " gallons converts to " + liters + " liters");
    }

}