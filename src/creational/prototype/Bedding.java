package creational.prototype;

public class Bedding  implements Cloneable{

    private String bedType;

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    @Override
    public Bedding clone() {
        try {
//            Bedding clone = (Bedding) super.clone(); // shallow copy
            Bedding clone = new Bedding();  // Deep copy
            clone.setBedType(this.getBedType());
            return clone;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
