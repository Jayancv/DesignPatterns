package behavioral.chainOfResponsibility;

public class ReservationRequest
{
    private String productCode;
    private String customerName;
    private int quantity ;

    public ReservationRequest( String productCode, String customerName, int quantity )
    {
        this.productCode = productCode;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode( String productCode )
    {
        this.productCode = productCode;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName( String customerName )
    {
        this.customerName = customerName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity( int quantity )
    {
        this.quantity = quantity;
    }
}
