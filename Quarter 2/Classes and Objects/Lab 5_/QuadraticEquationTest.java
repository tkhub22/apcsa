import java.util.Scanner;
public class QuadraticEquationTest
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
   
      for (int k = 1; k <=3; k++)
      {
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();
      
         QuadraticEquation q = new QuadraticEquation (a,b,c);
      
         if(q.noSolution() == true)
            System.out.println("No real solution");
         else if (q.equalRoots() == true)
            System.out.println ("The only solution is: " + q.getSolution1());
         else
         {
            System.out.println("The two real solutions are:");
            System.out.println(q.getSolution1());
            System.out.println(q.getSolution2());
         }
      }
   }
}

/*
 2
 3
 4
 No real solution
*/
/*
 1
 -5
 6
 The two real solutions are:
 3.0
 2.0
*/