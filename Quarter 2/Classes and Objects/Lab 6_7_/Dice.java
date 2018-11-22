/******************
Aditya Tikhe
Period 7
Lab 6
******************/
public class Dice
{
   private int side;
   
   public Dice ()
   {
      side = 2;
   }
   
   public void roll()
   {
      double d = Math.random();
      side = (int)(d*6) + 1;
   }
   public int currentSide()
   {
      return side;
   }
}