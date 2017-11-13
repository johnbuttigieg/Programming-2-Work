import java.util.*;



public class DistanceFromAverage
{


    public static void main (String[] args)  {


        int x = 0, y = 0;
        //array of 20. 20 is max.
        double[] numbers = new double[20];
        double inputNum;
        double total = 0;
        double average;
        final int STOP = 99999;



        Scanner input = new Scanner(System.in);
        System.out.print("Enter your chosen numbers entering one after the other and type " + STOP + " stop entering numbers and see the results!");



        inputNum = input.nextDouble();
        while (x < numbers.length && inputNum != STOP) {
            numbers[x] = inputNum;
            total += numbers[x];
            ++x;
            if (x < numbers.length) {
                System.out.print("Enter next numeric value or type " + STOP + " to quit >> ");
                inputNum = input.nextDouble();
            }
        }


        if (x == 0)
            System.out.println("No numbers were entered! Please try again.");
        else
        {
            average = total / x;
            System.out.println(x + "were entered to the program and the average of all of them are " + average);
            for (y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
        }
    }
}
