import java.util.*;
public class ValidatePassword  {


    public static void main(String[] args) {

        String input;
        int inputLength;
        int upperLetters = 0;
        int lowerLetters = 0;
        int Numbers = 0;
        final int VALID_LENGTH = 2;



        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password to see if it would be a valid one here --->");
        input = in.nextLine();
        inputLength = input.length();


        for(int i = 0; i < inputLength; i++) {
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch))
                upperLetters++;
            else
            if(Character.isLowerCase(ch))
                lowerLetters++;
            else
            if(Character.isDigit(ch))
                Numbers++;
        }

        if (upperLetters >= VALID_LENGTH && lowerLetters >= VALID_LENGTH && Numbers >= VALID_LENGTH)
            System.out.println("Your password is valid.");
        else
        {
            System.out.println("The passwords needs more...");
            if (upperLetters < VALID_LENGTH)
                System.out.println("Uppercase Letters");

            if (lowerLetters < VALID_LENGTH)
                System.out.println("Lowercase Letters");

            if (Numbers < VALID_LENGTH)
                System.out.println("Numbers");
        }
    }
}