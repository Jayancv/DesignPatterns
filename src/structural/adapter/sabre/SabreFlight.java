package structural.adapter.sabre;

public class SabreFlight {

    private String fltNo;
    private String airline;
    private double fare;
    private double cost;

    public String getFltNo() {
        return fltNo;
    }

    public void setFltNo(String fltNo) {
        this.fltNo = fltNo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
