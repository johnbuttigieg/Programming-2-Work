public class TwelveInts
{
    public static void main (String args[])  {
        int[] numbers = {2, 5, 8, 10, 13, 15, 17, 20, 23, 25, 28, 30};


        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();

        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();


    }
}


