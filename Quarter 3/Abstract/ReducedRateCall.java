public class ReducedRateCall extends LongDistanceCall
{   
   public ReducedRateCall ( int duration)
   {
      super(duration);
   }
   
   public static void main (String [] args) 
   {

   }
   
   public double getRate ()
   {
      return rate/2;
   }
}