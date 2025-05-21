package creational.factory;

import java.math.BigDecimal;

public abstract class AbstractBookingItem {

    private int bookingId;
    private BigDecimal price;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    abstract void calculateCostPrice();

}
