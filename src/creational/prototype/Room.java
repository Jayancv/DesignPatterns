package creational.prototype;

public class Room implements Cloneable{

    private Bedding bedding;
    private boolean airConditioned;
    private boolean hasBalcony;

    public Bedding getBedding() {
        return bedding;
    }

    public void setBedding(Bedding bedding) {
        this.bedding = bedding;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    @Override
    public Room clone() {
        try {
//            Room clone = (Room) super.clone();  // Shallow copy
            Room clone = new Room();   // Deep copy
            clone.setBedding(this.bedding.clone());
            clone.setAirConditioned(this.isAirConditioned());
            clone.setHasBalcony(this.isHasBalcony());
            return clone;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
