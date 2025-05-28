package structural.adapter;

public class Flight {
    private String fltNo;
    private String airline;
    private double fare;

    public Flight(String fltNo, double fare, String airline) {
        this.fltNo = fltNo;
        this.fare = fare;
        this.airline = airline;
    }

    public String getFltNo() {
        return fltNo;
    }

    public void setFltNo(String fltNo) {
        this.fltNo = fltNo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
}
