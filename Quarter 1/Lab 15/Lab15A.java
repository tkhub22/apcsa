/******************
Aditya Tikhe
Period 7
Lab 15A
Due Date: Oct 28
Date Submitted: Oct 28
What I learned: 
   a.  I learned how to use nested loops and conditions.
   b.  I practiced how to invoke a method. 
  
Purpose: The purpose of this program is to print perfect numbers and
         pairs of amicable numbers from 2 to 500.
******************/
public class Lab15A
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
         
         for(int j = i+1; j <500; j++)
         {
            int sum2 = computeAliquotSum(j);
            if(sum == j && sum2 == i)
            {
               System.out.println("the amicable numbers are: " + i + " " + j);
               break;
            }
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
 the amicable numbers are: 220 284
 496 is a perfect number
*/