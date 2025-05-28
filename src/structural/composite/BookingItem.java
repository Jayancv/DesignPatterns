package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BookingItem extends CostPriceItem {

    List<Supplement> itemSupplements;

    public BookingItem() {
        this.itemSupplements = new ArrayList<>();
    }

    public void addItemSupplement(Supplement supplement) {
        this.itemSupplements.add(supplement);
    }

    public void removeItemSupplement(Supplement supplement) {
        this.itemSupplements.remove(supplement);
    }

    public List<Supplement> getItemSupplements() {
        return itemSupplements;
    }

    @Override
    double calculateCost() {
        double totalCost = getCost();
        for (Supplement supplement : itemSupplements) {
            totalCost += supplement.calculateCost();
        }
        return totalCost;

    }

    @Override
    double calculatePrice() {
        double totalPrice = getPrice();
        for (Supplement supplement : itemSupplements) {
            totalPrice += supplement.calculatePrice();
        }
        totalPrice += (totalPrice * getMarkup() / 100);
        totalPrice -= (totalPrice * getDiscount() / 100);
        System.out.println("Booking Item Price: " + totalPrice);
        return totalPrice;

    }
}
