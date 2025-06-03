package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SeatTypeFactory {
    private static Map<String, ISeatType> seatTypesCache = new HashMap<>();

    public static ISeatType getSeatType(String seatType, String seatPosition) {
        String key = seatType + "-" + seatPosition;
        if (seatTypesCache.containsKey(key)) {
            System.out.println("Reusing existing seat type: " + key);
            return seatTypesCache.get(key);
        } else {
            ISeatType newSeatType = createSeatType(seatType, seatPosition);
            System.out.println("Creating new seat type: " + key);
            seatTypesCache.put(key, newSeatType);
            return newSeatType;
        }
    }

    private static ISeatType createSeatType(String seatType, String seatPosition) {
        return new SharedSeatType(seatType, seatPosition);
    }
}
