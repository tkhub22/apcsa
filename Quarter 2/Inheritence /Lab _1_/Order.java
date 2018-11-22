/******************
Aditya Tikhe
Period 7
Lab 1
******************/
public class Order 
{
   private String name;
   private int customerNumber;
   private int quantity;
   private double unitPrice;
   
   public Order (String name, int customerNumber, int quantity, double unitPrice)
   {
      this.name = name;
      this.customerNumber = customerNumber;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
   }
   
   public String getName()
   {
      return name;
   }
   public void setName(String n)
   {
      name = n;
   }
   public int getCustomerNumber()
   {
      return customerNumber;
   }
   public void setCustomerNumber (int cs)
   {
      customerNumber = cs;
   }
   public int getQuantity ()
   {
      return quantity;
   }
   
   public void setQuantity (int q)
   {
      quantity = q;
   }
  
   public double getUnitPrice()
   {
      return unitPrice;
   }
   public void setUnitPrice( double up)
   {
      unitPrice = up;
   }
   public double computePrice ()
   {
      return quantity*unitPrice;
      //System.out.println("\nTotal Price: " + totalPrice);
   }
   public String toString ()
   {
      return "Name: " + name + "\nCustomer Number: "
       + customerNumber + "\nQuantity: " + quantity + 
       "\nUnit Price: " + unitPrice + "\nTotal Price: " + 
       computePrice();
   }
   public boolean equals(Object other)
   {
      if (other instanceof Order)
      {
      
         return this.name.equals(((Order)other).getName()) && 
         this.customerNumber == ((Order)other).getCustomerNumber() &&
         this.quantity == ((Order)other).getQuantity() &&
         this.unitPrice == ((Order)other).getUnitPrice();
      }
      else return false; 
   }
}