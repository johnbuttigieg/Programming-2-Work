import java.util.Scanner;
public class InputCharacterInfo {


    public static void main(String[] args) {
        char character;
        String charInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type a single character -->");
        charInput = keyboard.nextLine();
        character = charInput.charAt(0);
        System.out.println("The character you type is: " + character);
        if(Character.isUpperCase(character))
            System.out.println(character + " is an uppercase character");
        else
            System.out.println(character + " is not an uppercase character");
        if(Character.isLowerCase(character))
            System.out.println(character + " is a lowercase character");
        else
            System.out.println(character + " is not a lowercase character");
        character = Character.toLowerCase(character);
        System.out.println("After toLowerCase(), character is " + character);
        character = Character.toUpperCase(character);
        System.out.println("After toUpperCase(), character is " + character);
        if(Character.isLetterOrDigit(character))
            System.out.println(character + " is a letter or digit");
        else
            System.out.println(character +
                    " is neither a letter nor a digit");
        if(Character.isWhitespace(character))
            System.out.println(character + " is a space");
        else
            System.out.println(character + " is not a space");
    }
}
