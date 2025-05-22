package creational.prototype;

public class ItemGenerator {
    public static void main(String[] args) {
        Bedding bedding = new Bedding();
        bedding.setBedType("King bed");

        BoardBasis boardBasis = new BoardBasis();
        boardBasis.setBoardBasisName("Bed & Breakfast");
        boardBasis.setBoardBasisCode("BB");

        Room room = new Room();
        room.setBedding(bedding);
        room.setAirConditioned(true);
        room.setHasBalcony(false);

        HotelItem item = new HotelItem();
        item.setHotelName("Hilton, Berlin");
        item.setNights(2);
        item.setBoardBasis(boardBasis);
        item.setRoom(room);

        HotelItem newItem = item.clone();

        if (newItem.getNights() != item.getNights()) {
            System.out.println("Wrong nights");
        }
        // Check uses same reference or not
        newItem.getRoom().getBedding().setBedType("Queen Bed");
        if (newItem.getRoom().getBedding().getBedType().equals(item.getRoom().getBedding().getBedType())) {
            System.out.println("Bed type equals");
        }


    }
}
