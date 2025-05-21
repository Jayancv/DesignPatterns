package creational.factory;

public class FlightBookingItem extends AbstractBookingItem {

    private String departureAirPort;
    private String arrivalAirPort;
    private String flightNo;

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getArrivalAirPort() {
        return arrivalAirPort;
    }

    public void setArrivalAirPort(String arrivalAirPort) {
        this.arrivalAirPort = arrivalAirPort;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    @Override
    void calculateCostPrice() {
        System.out.println("Flight booking price calculated.");
    }
}
