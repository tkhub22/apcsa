/******************
Aditya Tikhe
Period 7
Lab 8
******************/
public class RoachPopulation
{
   private int numOfRoaches;
   
   public RoachPopulation (int numOfRoaches)
   {
      this.numOfRoaches = numOfRoaches; 
   }
   public void waitForDoubling ()
   {
      numOfRoaches = numOfRoaches *2; 
   }
   
   public void spray ()
   {
      numOfRoaches = (int)(numOfRoaches * 0.9); 
   }
   
   public int getRoaches ()
   {
      return numOfRoaches; 
   }
   
   public String toString ()
   {
      return "There are " + numOfRoaches + " roaches."; 
   }
   
   
} 