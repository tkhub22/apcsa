/******************
Aditya Tikhe
Period 7
Lab 15B
Due Date: Oct 28
Date Submitted: Oct 28
What I learned: 
   a.  I learned how to use nested loops and conditions. 
   b.  I also practiced using relational operators.
  
Purpose: The purpose of this program is to print the perfect numbers between 2 and 500.
******************/
public class Lab15B
{
   public static void main (String [] args)
   {
      for(int i = 3; i < 500; i++)
      {
         int sum = computeAliquotSum(i);
         if(sum == i)
         {
            System.out.println(i+ " is a perfect number");
         }
      
      }
   }
   public static int computeAliquotSum (int number)
   {
      int sum = 0;
      int i = 1;
      while (i < number)
      { 
         if(number%i==0)
         {
            sum+=i; 
         }
         i++;
      }
       
      return sum;
   }
}

/*
 6 is a perfect number
 28 is a perfect number
 496 is a perfect number
*/