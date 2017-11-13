import javax.swing.*;


public class FixDebugEleven4 {
    static FixDebugBoat[] boatArray = new FixDebugBoat[5];
    public static void main(String[] args) {
        buildArray();
        displayArray();
    }


    public static void buildArray() {
        char boatType;
        for(int x = 0; x < boatArray.length; ++x) {
            boatType = getBoat();
            if(boatType =='r')
                boatArray[x] = new FixDebugRowboat();
            else
                boatArray[x] = new FixDebugOceanLiner();
        }
    }


    public static char getBoat() {
        String boatType;
        boatType = JOptionPane.showInputDialog(null, "Enter r for rowboat; o for ocean liner ");
        return boatType.charAt(0);
    }


    public static void displayArray() {
        for(int x = 0; x < boatArray.length; ++x)
            JOptionPane.showMessageDialog(null, "Boat #" + (x  + 1) + boatArray[x].toString());
    }
}
