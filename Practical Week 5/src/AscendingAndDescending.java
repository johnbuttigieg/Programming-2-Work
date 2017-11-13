import javax.swing.*;

public class AscendingAndDescending {


    public static void main(String[] args) {
        int one, two, three;
        int bottom, med, high;
        String inputString;




        inputString = JOptionPane.showInputDialog(null, "Enter integer number one");
        one = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog(null, "Enter integer number two");
        two = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog(null, "Enter integer number three");
        three = Integer.parseInt(inputString);


        if (one <= two && one <= three) {
            bottom = one;
            if (two <= three) {
                med = two;
                high = three;
            }
            else
            {
                med = three;
                high = two;
            }
        }
        else {
            if (two <= one && two <= three) {
                bottom = two;
                if (one <= three) {
                    med = one;
                    high = three;
                }
                else {
                    med = three;
                    high = one;
                    }
                }

                else {
                bottom = three;
                if (one <= two) {
                    med = one;
                    high = two;
                }
                else
                {
                    med = two;
                    high = one;

                }
            }


        }


        System.out.println("In ASCENDING ORDER: " + bottom + " " + med + " " + high);
        System.out.println("In DESCENDING ORDER: " + high + " " + med + " " + bottom);
    }


}
