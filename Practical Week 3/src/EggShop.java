import java.util.Scanner;

public class EggShop {

    public static void main (String[] args) {
        int dozen = 12;
        int eggsBought;
        int dozenBought;
        double eggsPrice = 0.45;
        double dozenPrice = 3.25;
        int remainder;
        double total;

        Scanner amount = new Scanner(System.in);
        System.out.print("How many eggs would you like?");
        eggsBought = amount.nextInt();
        dozenBought = eggsBought / dozen;
        remainder = eggsBought % dozen;
        total = (dozenBought * dozenPrice) + (eggsPrice * remainder);

        System.out.print("You have bought " + eggsBought + " eggs which costs " + total);


    }
}
