/******************
Aditya Tikhe
Period 7
Lab 5
******************/

public class QuadraticEquation
{
   private int a;
   private int b;
   private int c;
   
   public QuadraticEquation (int a, int b, int c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   public double getSolution1 ()
   {
      return (-b + Math.sqrt(findDiscriminant()))/2*a;
   }
   
   public double getSolution2 ()
   {
      return (-b - Math.sqrt(findDiscriminant()))/2*a;
   }
   
   private double findDiscriminant()
   {
      return Math.pow(b,2) - 4*a*c; 
   }
   
   public boolean noSolution ()
   {
      if (findDiscriminant() <0)
         return true;
      else 
         return false;
         
   }
   
   public boolean equalRoots()
   {
      if (findDiscriminant() == 0)
         return true;
      else 
         return false;  
   
   }
}

