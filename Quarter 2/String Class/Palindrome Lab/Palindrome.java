/*
Aditya Tikhe
Period 7
Lab 2 (Palindrome Lab)
Due Date: Dec 13
Date Submitted: Dec 13
What I learned: 
   a.  I learned how to remove spaces from a String by creating a new String
         to make the "new", "no spaces" string.
   b. I also learned how to write the method which ignores the casing to check
      if a word is a palindrome or not.
   c. I learned many new String syntax such as .length and .charAt
   d. I finally practiced basic Java concepts such as if conditions, for loops
      and writing methods.
Purpose: The purpose of this program is to insert a String and check whether
         or not it is a palindrome by reversing the String and removing spaces.
*/
import java.util.Scanner;
public class Palindrome
{
   public static void main (String [] args)
   {
      String s;
      boolean isPalindrome;
      Scanner console = new Scanner(System.in);
      String reverse;
             
      for (int k = 1; k<8; k++)
      {
         System.out.print("Enter a string: ");
         s = console.nextLine ();
      
         isPalindrome = check(s);
         if (isPalindrome == true)
            System.out.println (s + " is a palindrome\n\n");
         else 
            System.out.println (s + " is NOT a palindrome\n\n");
      }
        
   }
   //post: returns true if s is a palindrome; otherwise, return false.
   public static boolean check (String s)
   {
      String str = removeSpace(s);
      String str0 = "";
      for (int i = 1; i <= str.length(); i++)
      {
         Character ch = str.charAt(str.length() - i);
         str0 += ch;
      }
      if( str0.equalsIgnoreCase(str))
         return true;
      else
         return false;
   
   }
   //post: return a String without spaces in it 
   public static String removeSpace (String s)
   {
      int start =0;
      String str="";
      String newString=s;
      while(newString.length()!=0 && newString.indexOf(" ")!=-1 )
      {
         int index = newString.indexOf(" ");
         str = str+newString.substring(start, index);
         newString = newString.substring(index+1);
      }
     
      return str+newString;
   }
}
/*
 Enter a string: taco cat
 taco cat is a palindrome
*/
/*
 Enter a string: nitin
 nitin is a palindrome
*/
/*
 Enter a string: aditya
 aditya is NOT a palindrome
*/