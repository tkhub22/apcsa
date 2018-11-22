/*
Aditya Tikhe
Period: 7
Phone Call Lab
Due Date: Feb 7
Date Submitted Feb 7
What I learned in this lab:
   a: I practiced a basic introduction to abstract classes and how they work.
      - also understood the functionality of abstract classes
   b: I reviewed scope of member variables.
What I think of this lab:
   a: I think this lab is a good introduction to abstract classes.
   b: I don't like how the lab was presented as it left out the LocalCall class.
      - the directions say to create PhoneCall, LongDistance and ReducedCall but not
        LocalCall. In the end it says to test LocalCall though.
*/
public abstract class PhoneCall
{
    int duration;
    int rate;
   
   public PhoneCall()
   {
   
   }
    
   public double getDuration()
   {
      return duration;
   }
   
   public double getRate ()
   {
      return rate;
   }
   
   private int totalCost()
   {
      return(int)(duration * getRate());
      
   } 
   
   public String toString ()
   {
      return "duration: " + getDuration() + "  rate: " + getRate() + "  total cost: " + totalCost();
   }  
}