package structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Proxy class : acts as a placeholder for the real service
// This proxy adds caching and authentication checks
public class ReservationServiceProxy implements IReservationService {

    private final IReservationService realService;
    private Map<String, List<HotelResult>> cache;
    private List<Long> authenticatedUsers;

    public ReservationServiceProxy(List<Long> authenticatedUsers) {
        this.realService = new TVReservationService();
        ;
        cache = new HashMap<>();
        this.authenticatedUsers = authenticatedUsers;

    }

    @Override
    public List<HotelResult> searchHotels(String city, String checkIn, String checkOut, int guests) {
        String cacheKey = city + "~" + checkIn + "~" + checkOut + "~" + guests;
        if (getCachedResults(cacheKey) == null || getCachedResults(cacheKey).isEmpty()) {
            List<HotelResult> results = realService.searchHotels(city, checkIn, checkOut, guests);
            cache.put(cacheKey, results);
            return results;

        } else {
            System.out.println("Returning cached results for: " + cacheKey);
            return getCachedResults(cacheKey);
        }

    }

    @Override
    public boolean holdReservation(long userId, String itemCode) {
        if (isAuthenticated(userId)) {
            return realService.holdReservation(userId, itemCode);
        } else {
            System.out.println("User " + userId + " is not authenticated. Cannot hold reservation.");
        }
        return false;
    }

    @Override
    public boolean confirmReservation(long userId, String itemCode) {

        if (isAuthenticated(userId)) {
            return realService.confirmReservation(userId, itemCode);
        } else {
            System.out.println("User " + userId + " is not authenticated. Cannot confirm reservation.");
        }
        return false;
    }

    @Override
    public boolean cancelReservation(long userId, String itemCode) {
        if (isAuthenticated(userId)) {
            return realService.cancelReservation(userId, itemCode);
        } else {
            System.out.println("User " + userId + " is not authenticated. Cannot cancel reservation.");
        }
        return false;
    }

    private boolean isAuthenticated(long userId) {
        return authenticatedUsers.contains(userId);
    }

    private List<HotelResult> getCachedResults(String key) {
        return cache.getOrDefault(key, List.of());
    }
}
