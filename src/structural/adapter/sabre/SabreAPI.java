package structural.adapter.sabre;

import java.util.List;

public class SabreAPI {
    public List<SabreFlight> searchFlight(String depDate, String departure, String arrival) {
        SabreFlight s1 = new SabreFlight();
        s1.setFltNo("UA-101");
        s1.setAirline("United Airlines");
        s1.setFare(520.0);
        s1.setCost(480.0);

        SabreFlight s2 = new SabreFlight();
        s2.setFltNo("DL-202");
        s2.setAirline("Delta Airlines");
        s2.setFare(610.0);
        s2.setCost(570.0);

        SabreFlight s3 = new SabreFlight();
        s3.setFltNo("LH-303");
        s3.setAirline("Lufthansa");
        s3.setFare(210.0);
        s3.setCost(190.0);

        return List.of(s1, s2, s3);


    }
}
