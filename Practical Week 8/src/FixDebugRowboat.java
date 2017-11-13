public class FixDebugRowboat extends FixDebugBoat {


    public FixDebugRowboat() {
        super("rowwww");
        setPassengers();
        setPower();
    }


    public void setPassengers() {
        super.passengers = 2;
    }


    public void setPower() {
        super.power = "SUPER OARS";
    }
}