package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Booking extends CostPriceItem {
    List<BookingItem> bookingItems;
    List<Supplement> bookingSupplements;

    public Booking() {
        this.bookingItems = new ArrayList<>();
        this.bookingSupplements = new ArrayList<>();
    }

    public void addBookingItem(BookingItem item) {
        this.bookingItems.add(item);
    }

    public void removeBookingItem(BookingItem item) {
        this.bookingItems.remove(item);
    }

    public void addBookingSupplement(Supplement supplement) {
        this.bookingSupplements.add(supplement);
    }

    public void removeBookingSupplement(Supplement supplement) {
        this.bookingSupplements.remove(supplement);
    }

    public List<BookingItem> getBookingItems() {
        return bookingItems;
    }

    public void setBookingItems(List<BookingItem> bookingItems) {
        this.bookingItems = bookingItems;
    }

    public List<Supplement> getBookingSupplements() {
        return bookingSupplements;
    }

    public void setBookingSupplements(List<Supplement> bookingSupplements) {
        this.bookingSupplements = bookingSupplements;
    }

    @Override
    double calculateCost() {
        double totalCost = getCost();
        for (BookingItem item : bookingItems) {
            totalCost += item.calculateCost();
        }
        for (Supplement supplement : bookingSupplements) {
            totalCost += supplement.calculateCost();
        }
        return totalCost;
    }

    @Override
    double calculatePrice() {
        double totalPrice = getPrice();
        for (BookingItem item : bookingItems) {
            totalPrice += item.calculatePrice();
        }
        for (Supplement supplement : bookingSupplements) {
            totalPrice += supplement.calculatePrice();
        }
        return totalPrice;
    }
}
