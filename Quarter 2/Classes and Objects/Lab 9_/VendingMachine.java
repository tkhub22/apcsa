/******************
Aditya Tikhe
Period 7
Lab 9
******************/
public class VendingMachine
{
   private int sodaCanCount;
   private int tokenCount;
   
   public VendingMachine()
   {
      tokenCount = 0;
      sodaCanCount = 10;
   }
   
   public VendingMachine (int cans)
   {
      this.sodaCanCount = cans;
      tokenCount = 0;
   }
   
   public int getSodaCanCount()
   {
      return sodaCanCount;
   }
   public void setSodaCanCount(int canCount)
   {
      sodaCanCount = canCount;
   }
   
   public int getTokenCount()
   {
      return tokenCount;
   }
   public void setTokenCount(int tCount)
   {
      tokenCount = tCount;
   }
   public void insertToken()
   {
      tokenCount = tokenCount + 1;
      sodaCanCount = sodaCanCount - 1; 
   }
   
   public void addCans (int numOfNewCans)
   {
      sodaCanCount += numOfNewCans; 
   }
   public String toString()
   {
      return "number of cans " + Math.abs(sodaCanCount) + "\n number of tokens " + tokenCount;
   }  
}