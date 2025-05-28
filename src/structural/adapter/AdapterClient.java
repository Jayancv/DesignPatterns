package structural.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {
        searchFlights("CDG", "LHR", "2025-10-01");
    }

    public static void searchFlights(String from, String to, String date) {

        System.out.println("Searching flights from " + from + " to " + to + " on " + date);

        List<IFlightProvider> flightProviders = List.of(new AmadeusAdapter(), new SabreAdapter());
        for (IFlightProvider provider : flightProviders) {
            List<Flight> flights = null;
            try {
                flights = provider.searchFlights(from, to, new SimpleDateFormat("yyyy-MM-dd").parse(date));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if (!flights.isEmpty()) {
                System.out.println("Flights found with " + provider.getClass().getSimpleName() + ":");
                for (Flight flight : flights) {
                    System.out.println("Flight No: " + flight.getFltNo() + ", Airline: " + flight.getAirline() + ", Fare: " + flight.getFare());
                }
            } else {
                System.out.println("No flights found with " + provider.getClass().getSimpleName() + ".");
            }
        }
    }
}