/******************
Aditya Tikhe
Period 7
Lab 2
******************/
public class Vehicle
{
   private String mName;
   private int cylinder;
   private Person owner;
   
   public Vehicle ()
   {
      mName = "Lau1";
      cylinder = 5;
      owner=new Person();  
   }
   public Vehicle (String mName, int cylinder, Person owner)
   {
      this.mName = mName;
      this.cylinder = cylinder;
      this.owner = owner;
   }
   public String getMName()
   {
      return mName;
   }
   public int getCylinder()
   {
      return cylinder;
   }
   public Person getOwner()
   {
      return owner;
   }
   public boolean equals (Object other)
   {
      if (other instanceof Vehicle)
      {
      
         return this.mName.equals(((Vehicle)other).getMName()) && 
         this.cylinder == ((Vehicle)other).getCylinder() &&
         this.owner.equals(((Vehicle)other).getOwner());
      }
      else return false; 
   }
}     
