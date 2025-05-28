package structural.proxy;

import java.util.List;

// Real Subject
public class TVReservationService implements IReservationService {

    @Override
    public List<HotelResult> searchHotels(String city, String checkIn, String checkOut, int guests) {

        List<HotelResult> results = List.of(
                new HotelResult("TV Hotel", "Deluxe Suite", "Full Board", 3, 299.99),
                new HotelResult("TV Inn", "Standard Room", "Bed & Breakfast", 2, 199.99)
        );
        System.out.println("TVReservationService: Returning results for searchHotels");

        return results;
    }

    @Override
    public boolean holdReservation(long userId, String itemCode) {
        System.out.println("TVReservationService: Holding reservation for user " + userId + " with item code " + itemCode);
        return true;
    }

    @Override
    public boolean confirmReservation(long userId, String itemCode) {
        return false;
    }

    @Override
    public boolean cancelReservation(long userId, String itemCode) {
        return false;
    }
}
