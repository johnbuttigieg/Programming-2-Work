import java.util.Scanner;

public class CountByAnything
{


    public static void main (String args[]) {
        final int MAX = 200;
        final int NEW_LINE;
        int numberJump;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the interval between numbers here -->");
        numberJump = keyboard.nextInt();
        NEW_LINE = numberJump * 10;


        for (int i = numberJump; i <= MAX; i += numberJump) {
            System.out.print(i + "  ");
            if (i % NEW_LINE == 0)
                System.out.println();
        }
    }
}


