package creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * This guarantees that a class has just one instance
 * provide access it globally
 * used for logging, drivers objects(Database), caching, and thread pool
 */
public class FareCache {
    private static volatile FareCache instance = null;
    private Map<String, Double> fares = new HashMap<>();

    private FareCache() {
        fares = loadFares();
    }

    public static FareCache getInstance() {
        if (instance == null) {
            synchronized (FareCache.class) {
                if (instance == null) {
                    instance = new FareCache();
                }
            }
        }
        return instance;
    }

    /**
     * Load fares from DB
     *
     * @return
     */
    private Map<String, Double> loadFares() {
        Map<String, Double> fareList = new HashMap<>();
        fareList.put("Single", 10.00);

        return fareList;

    }

}

