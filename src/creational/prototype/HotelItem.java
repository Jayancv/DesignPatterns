package creational.prototype;

public class HotelItem implements Cloneable {

    private String hotelName;
    private Room room;
    private BoardBasis boardBasis;
    private int nights;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public BoardBasis getBoardBasis() {
        return boardBasis;
    }

    public void setBoardBasis(BoardBasis boardBasis) {
        this.boardBasis = boardBasis;
    }

    @Override
    public HotelItem clone() {
        try {
//            HotelItem clone = (HotelItem) super.clone();   // Shallow copy
            HotelItem clone = new HotelItem();   // Deep copy
            clone.setNights(this.getNights());
            clone.setHotelName(this.getHotelName());
            clone.setRoom(this.room.clone());
            clone.setBoardBasis(this.boardBasis.clone());
            return clone;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
