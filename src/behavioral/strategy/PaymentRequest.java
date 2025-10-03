package behavioral.strategy;

//Context
public class PaymentRequest
{
    IPaymentStrategy paymentStrategy;

    public PaymentRequest(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void performPayment(){
        paymentStrategy.pay();
        System.out.println("Payment done !");
    }
}
