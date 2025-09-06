package behavioral.command;


// The device or service
public class ReservationService
{
    public void createReservation(){
        System.out.println("Reservation created.");
    }

    public void modifyReservation(){
        System.out.println("Reservation modified.");
    }
    public void cancelReservation(){
        System.out.println("Reservation cancelled.");
    }

}
