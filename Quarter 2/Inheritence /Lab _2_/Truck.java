public class Truck extends Vehicle
{
   private double loadCapacity;
   private int towingCapacity;
   
   public Truck ()
   {
      super();
      this.loadCapacity = 0.00;
      this.towingCapacity = 0;
   }
   
   public Truck(String mName, int cylinder, Person owner, double loadCapacity, int towingCapacity)
   {
      super(mName, cylinder, owner);
      this.loadCapacity = loadCapacity;
      this.towingCapacity = towingCapacity;    
   }
   
   public double getLoadCapacity ()
   {
      return loadCapacity;
   }
   
   public int getTowingCapacity()
   {
      return towingCapacity;
   }
   
   public boolean equals (Object other) 
   {
      if (other instanceof Truck)
      {
         return super.equals(other) &&
         this.loadCapacity == ((Truck)other).getLoadCapacity() &&
         this.towingCapacity == ((Truck)other).getTowingCapacity();  
      }
      else 
         return false;
   } 
}