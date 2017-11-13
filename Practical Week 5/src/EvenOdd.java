import javax.swing.*;

public class EvenOdd {


    public static void main(String[] args) {
        int inputInt;
        String inputString;

        inputString = JOptionPane.showInputDialog(null, "Enter a number to find out if it's odd or even.");
        inputInt = Integer.parseInt(inputString);

        if (inputInt % 2 == 1)
            System.out.println("The answer is ODD");
        else
            System.out.println("The answer is EVEN");


    }
}
