import java.util.Scanner;

public class BookstoreCredit {


    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        double gpa;
        String name;
        System.out.print("Type your name here: ");
        name = input.nextLine();
        System.out.print("What is your GPA?: ");
        gpa = input.nextDouble();
        discount(name, gpa);


    }


    public static void discount(String name, double gpa)
    {
        double discount;
        final double CREDIT = 10;
        discount = gpa * CREDIT;
        System.out.println("Hello: " + name + ", your discount is $" + discount);

    }

}
