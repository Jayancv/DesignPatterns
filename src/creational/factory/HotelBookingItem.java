package creational.factory;

public class HotelBookingItem extends AbstractBookingItem{

    private String address;
    private String city;
    private String roomType;
    private String boardBasis;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBoardBasis() {
        return boardBasis;
    }

    public void setBoardBasis(String boardBasis) {
        this.boardBasis = boardBasis;
    }

    @Override
    void calculateCostPrice() {
        System.out.println("Hotel booking price calculated.");
    }
}
