package structural.adapter.amadeus;

import java.util.Date;
import java.util.List;

public class AmadeusAPI {

    public List<AmadeusFltResult> searchFlights(Date depDate, String departure, String arrival) {

        AmadeusFltResult r1 = new AmadeusFltResult();
        r1.setFltNo("AA-234");
        r1.setAirline("American Airlines");
        r1.setFare(500.0);
        r1.setCost(450.0);
        r1.setDiscount(10.0);

        AmadeusFltResult r2 = new AmadeusFltResult();
        r2.setFltNo("BA-230");
        r2.setAirline("British Airways");
        r2.setFare(600.0);
        r2.setCost(550.0);
        r2.setDiscount(8.0);

        AmadeusFltResult r3 = new AmadeusFltResult();
        r3.setFltNo("AF-300");
        r3.setAirline("Air France");
        r3.setFare(200.0);
        r3.setCost(180.0);
        r3.setDiscount(5.0);

        return List.of(r1, r2, r3);
    }

}

