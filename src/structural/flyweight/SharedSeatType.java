package structural.flyweight;

public class SharedSeatType implements ISeatType {

    private String seatType = null;
    private String seatPosition = null;


    public SharedSeatType(String seatType, String seatPosition) {
        this.seatType = seatType;
        this.seatPosition = seatPosition;
    }

    @Override
    public String displaySeatType() {
        return "Shared Seat Type: " + seatType + " in Position: " + seatPosition;
    }
}
