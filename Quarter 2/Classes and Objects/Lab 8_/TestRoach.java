public class TestRoach
{
   public static void main (String [] args)
   {
      RoachPopulation kitchen = new RoachPopulation(10);
      
      for (int k = 1; k <=3; k++)
      {
         kitchen.waitForDoubling();
         kitchen.spray();
         System.out.println (kitchen);
      }
   }
}

/*
 There are 18 of roaches.
 There are 32 of roaches.
 There are 57 of roaches.
*/