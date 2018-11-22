public class TestPhoneCall
{
   public static void main (String [] args)
   {
      PhoneCall [] calls = new PhoneCall [4];
      
      //calls[0] = new LocalCall(10,2); didnt specify how to make it in directions
      calls[1] = new LongDistanceCall (3);
      calls[2] = new ReducedRateCall (8);
      
      for(PhoneCall call : calls)
         System.out.println(call);
   }
}
/*
 null
 duration: 3.0  rate: 6.0  total cost: 18
 duration: 8.0  rate: 3.0  total cost: 24
 null
*/