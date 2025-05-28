package structural.composite;

public class Supplement extends CostPriceItem {

    public Supplement(double cost, double price, double markup, double discount) {
        this.setCost(cost);
        this.setPrice(price);
        this.setMarkup(markup);
        this.setDiscount(discount);
    }

    @Override
    public double calculateCost() {
        return getCost();
    }

    @Override
    public double calculatePrice() {
        double finalPrice = getPrice() + (getPrice() * getMarkup() / 100);
        finalPrice -= (finalPrice * getDiscount() / 100);
        System.out.println("Supplement Price: " + finalPrice);
        return finalPrice;
    }
}
