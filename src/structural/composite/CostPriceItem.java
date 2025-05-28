package structural.composite;

public abstract class CostPriceItem {

    private double cost;     // Nett Cost of the item
    private double price;    // Price before markup and discount
    private double markup;   // Markup percentage to be applied on the price
    private double discount; // Discount percentage to be applied on the final price

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    abstract double calculateCost();

    abstract double calculatePrice();
}
