package structural.proxy;

import java.util.List;

public class ReservationHandler {

    public static void main(String[] args) {
        List<Long> authenticatedUsers = List.of(1001L, 1002L, 1003L);

        IReservationService reservationService = new ReservationServiceProxy(authenticatedUsers);
        List<HotelResult> results1 = reservationService.searchHotels("New York", "2023-10-01", "2023-10-05", 2);
        List<HotelResult> results2 = reservationService.searchHotels("New York", "2023-10-01", "2023-10-05", 1);
        List<HotelResult> results3 = reservationService.searchHotels("New York", "2023-10-01", "2023-10-05", 2);
        List<HotelResult> results4 = reservationService.searchHotels("Paris", "2023-10-01", "2023-10-05", 2);
        List<HotelResult> results5 = reservationService.searchHotels("Paris", "2023-10-01", "2023-10-05", 2);

        reservationService.holdReservation(1001L, "NYC-123");
        reservationService.holdReservation(1000L, "NYC-123");
        reservationService.holdReservation(1003L, "NYC-123");

    }

}
