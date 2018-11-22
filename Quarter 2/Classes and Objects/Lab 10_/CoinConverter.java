/*
Aditya Tikhe
Period 7
Lab 10
*/
import java.util.Scanner;
public class CoinConverter
{
   private int numOfCents;
   
   public CoinConverter(int numOfCents)
   {
      this.numOfCents = numOfCents;
   }
   public int getQuarters ()
   {
      int quarters = numOfCents/25;
      return quarters;
   }
   public int getDimes()
   {
      int dimes = numOfCents%25/10;
      return dimes;
   }
   public int getNickels ()
   {
      int nickels = numOfCents%25%10/5;
      return nickels;
   }
   public int getPennies ()
   {
      int pennies = numOfCents%25%10%5;
      return pennies;
   }
   public String toString ()
   {
      return "Change " + numOfCents + " cents =\n" + getQuarters() + " quarters\n" + getDimes() + " dimes\n" + getNickels() + " nickels\n" + getPennies() + " pennies";
   }
   public static void main (String [] args) 
   {
      CoinConverter machine; 
      int amountInCents;
      Scanner input = new Scanner (System.in);
   
      System.out.println("Enter the amount you want to convert: ");
      amountInCents = input.nextInt();
      machine = new CoinConverter (amountInCents);
      System.out.println(machine);
   }
}
/*
 Enter the amount you want to convert: 
 0
 Change 0 cents =
 0 quarters
 0 dimes
 0 nickels
 0 pennies
*/
/*
 Enter the amount you want to convert: 
 100
 Change 100 cents =
 4 quarters
 0 dimes
 0 nickels
 0 pennies
*/
/*
 Enter the amount you want to convert: 
 95
 Change 95 cents =
 3 quarters
 2 dimes
 0 nickels
 0 pennies
*/
/*
 Enter the amount you want to convert: 
 99
 Change 99 cents =
 3 quarters
 2 dimes
 0 nickels
 4 pennies
*/
/*
 Enter the amount you want to convert: 
 60
 Change 60 cents =
 2 quarters
 1 dimes
 0 nickels
 0 pennies
*/
/*
 Enter the amount you want to convert: 
 75
 Change 75 cents =
 3 quarters
 0 dimes
 0 nickels
 0 pennies
*/