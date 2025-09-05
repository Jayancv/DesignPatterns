package behavioral.chainOfResponsibility;

public interface IHandler
{
    abstract boolean handleRequest(ReservationRequest request);
}
