public class FixDebugEleven3 {


    public static void main(String args[]) {
        FixDebugRowboat redBoat = new FixDebugRowboat();
        FixDebugRowboat blueBoat = new FixDebugRowboat();
        System.out.print("The two boats are");
        if(redBoat == blueBoat)
            System.out.println(" equal");
        else
            System.out.println(" not equal");
    }
}
