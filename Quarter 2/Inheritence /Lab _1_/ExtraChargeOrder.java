public class ExtraChargeOrder extends Order
{
   public double computePrice()
   {
      //super.computePrice();
      return getQuantity()*getUnitPrice() + 4.00;
      //System.out.println("\nTotal Price: " + totalPrice);
   }
  
   public ExtraChargeOrder(String name, int customerNumber, int quantity, double unitPrice)
   {
      super(name,customerNumber, quantity,unitPrice);
   }
 
   
}
   