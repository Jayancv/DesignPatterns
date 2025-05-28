package structural.adapter;

import java.util.Date;
import java.util.List;

public interface IFlightProvider {
   List<Flight> searchFlights(String from, String to, Date date);
}
