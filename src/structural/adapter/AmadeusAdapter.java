package structural.adapter;

import structural.adapter.amadeus.AmadeusAPI;
import structural.adapter.amadeus.AmadeusFltResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AmadeusAdapter implements IFlightProvider {

    @Override
    public List<Flight> searchFlights(String from, String to, Date date) {
        AmadeusAPI amadeusAPI = new AmadeusAPI();
        List<AmadeusFltResult> results = amadeusAPI.searchFlights(date, from, to);
        if (results != null && !results.isEmpty()) {
            return results.stream()
                    .map(result -> new Flight(result.getFltNo(), result.getFare() - result.getDiscount(), result.getAirline()))
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
