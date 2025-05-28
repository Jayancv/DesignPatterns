package structural.proxy;

import java.util.List;

// Subject interface for the Proxy pattern
public interface IReservationService {

    List<HotelResult> searchHotels(String city, String checkIn, String checkOut, int guests);

    boolean holdReservation(long userId, String itemCode);

    boolean confirmReservation(long userId, String itemCode);

    boolean cancelReservation(long userId, String itemCode);

}
