public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("John");
        displayLetter();
        displaySalutation("John", "Buttigieg");
        displayLetter();
    }


    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr or Miss. " + lastName);
    }


    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }


    public static void displayLetter()
    {
        System.out.println("Thank you for your order.\n");
    }
}