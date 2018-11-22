public class LongDistanceCall extends PhoneCall
{
   public int rate=6;   
   public LongDistanceCall ( int iduration)
   {
   
      duration = iduration;
   }
   
   public static void main (String [] args) 
   {

   }
   
   public double getRate ()
   {
      return rate;
   }
}