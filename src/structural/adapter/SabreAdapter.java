package structural.adapter;

import structural.adapter.sabre.SabreAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SabreAdapter implements IFlightProvider {


    @Override
    public List<Flight> searchFlights(String from, String to, Date date) {
        SabreAPI sabreAPI = new SabreAPI();
        List<structural.adapter.sabre.SabreFlight> results = sabreAPI.searchFlight(date.toString(), from, to);
        if (results != null && !results.isEmpty()) {
            return results.stream()
                    .map(result -> new Flight(result.getFltNo(), result.getFare(), result.getAirline()))
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }
}
