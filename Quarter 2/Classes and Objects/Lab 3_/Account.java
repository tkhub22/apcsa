/******************
Aditya Tikhe
Period 7
Lab 3
Due Date: Nov. 15
******************/
public class Account
{
   private double balance; 
   
   public Account(double newBalance)
   {
      balance = newBalance;
   }
   
   public Account()
   {
      balance = 0.0; 
   }
   
   public void deposit(double deposit)
   {
      balance = balance + deposit; 
   }
   
   public void withdraw(double withdraw)
   {
      if (balance<withdraw)
      {
         balance = balance - 5; 
      }
      else 
      {
         balance = balance - withdraw;
      }
   }
   
   public boolean equals (Object other)
   {
      if (other instanceof Account)
      
         return this.balance == ((Account) other).balance;
      
      else 
         return false; 
   }
   
   public String toString ()
   {
      return "balance: " + balance;  
   }
   
   public static void main (String [] args)
   {
      Account myAccount = new Account(10.50);
      System.out.println(myAccount.balance);
      myAccount.deposit(20); 
      System.out.println("My account after depositing 20: " + myAccount.balance);
      myAccount.withdraw(40);
      System.out.println("My account after removing 15: " + myAccount.balance);
   }

}

