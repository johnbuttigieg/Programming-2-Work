public class CountByThrees
{


    public static void main (String args[])  {
        int start = 3;
        int stop = 300;
        final int NEW_LINE = 30;
        for (int i = start; i <= stop; i += start) {
            System.out.print(i + "  ");
            if(i % NEW_LINE == 0)
                System.out.println();
        }
    }
}


