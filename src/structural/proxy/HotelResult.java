package structural.proxy;

public class HotelResult {
    private String hotelName;
    private String roomType;
    private String boardBasis;
    private int nights;
    private double price;

    public HotelResult(String hotelName, String roomType, String boardBasis, int nights, double price) {
        this.hotelName = hotelName;
        this.roomType = roomType;
        this.boardBasis = boardBasis;
        this.nights = nights;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
