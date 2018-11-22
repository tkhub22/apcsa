/*
Aditya Tikhe
Period 7
Lab 3 (Password Lab)
Due Date: Jan 3
Date Submitted: Jan 3
What I learned: 
   a. I learned how to check if a certain character is in a string.
   b. I learned to work with methods to check if condition is fulfilled.
   c. I also worked more with loops and string methods. 
Purpose: The purpose of this program is to determine how strong a password is by its length
         and the various characters that make it up.
How I feel about the lab:
    I feel like this lab is relevant because we all have passwords for emails
    and such and coding a password strength indicator is very useful. 
What I am wondering:
   Could I use an array instead of the static string attributes?
*/
import java.util.Scanner;
public class PasswordStrength
{
   static String strNumber = "01234567879";
   static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
   static String upperCase = "ABCDEFGHIJKLMNOPQRSTUBWXYZ";
   static String specialChars = "!@#$%^&*()<>?~`?'.,;";
   
   public static void main (String [] args)
   {
      System.out.println("Enter a password; a strong password should contain letters, numbers, and special characters");
      Scanner console = new Scanner(System.in);
      String password = console.nextLine ();
      int value = passwordValidator(password);
      if (value == 1)
         System.out.println("The password " + password + " is a very weak password");
      if (value ==2)
         System.out.println("The password " + password + " is a weak password");
      if (value ==3)
         System.out.println("The password " + password + " is a strong password");
      if (value ==4)
         System.out.println("The password " + password + " is a very strong password");
      if (value ==5)
         System.out.println("The password " + password + " is an unacceptable password.");
   }
   public static int passwordValidator (String password)
   {
      if (password.length() < 8 && isNumbersOnly(password) == true)
         return 1;
      if (password.length() < 8 && isLettersOnly(password) == true)
         return 2;
      if (password.length() >= 8 && hasNumbers(password) == true && hasLetters(password) == true && hasSpecialChars (password) == true)
         return 4;
      if (password.length() >= 8 && hasNumbers(password) == true && hasLetters(password) == true)
         return 3;
      else return 5;
   }
   public static boolean isNumbersOnly(String password)
   {
      int i = 0;
    
      boolean flag = true;
      Character ch;
      for (i=0; i< password.length(); i++) {
         ch = password.charAt(i);
         int search = strNumber.indexOf(ch);
         if (search == -1){
            flag = false;
            break;
         }               
      }
      return flag;
   }
   public static boolean isLettersOnly(String password)
   {
      int i = 0;
      boolean flag = true;
      Character ch;
      for (i=0; i< password.length(); i++) {
         ch = password.charAt(i);
         int search = lowerCase.indexOf(ch);
         int search1 = upperCase.indexOf(ch);
         if ((search == -1) && (search1 == -1)){
            flag = false;
            break;
         }
      }
      return flag;
   }
   public static boolean hasNumbers (String password)
   {
      int i = 0;
      boolean flag = false;
      Character ch;
      for (i=0; i< password.length(); i++) {
         ch = password.charAt(i);
         int search = strNumber.indexOf(ch);
         if (search >= 0){
            flag = true;
            break;
         }
      }
      return flag; 
   }
   public static boolean hasLetters (String password)
   {
      int i = 0;
      boolean flag = false;
      Character ch;
      for (i=0; i< password.length(); i++) {
         ch = password.charAt(i);
         int search = lowerCase.indexOf(ch);
         int search1 = upperCase.indexOf(ch);
         if (search >= 0 || search1>=0){
            flag = true;
            break;
         }
      }
      return flag; 
   }
   public static boolean hasSpecialChars (String password)
   {
         int i = 0;
      boolean flag = false;
      Character ch;
      for (i=0; i< password.length(); i++) {
         ch = password.charAt(i);
         int search = specialChars.indexOf(ch);
         if (search >= 0){
            flag = true;
            break;
         }
      }
      return flag; 
   }  
}
/*
 Enter a password; a strong password should contain letters, numbers, and special characters
 123332
 The password 123332 is a very weak password
*/
/*
 Enter a password; a strong password should contain letters, numbers, and special characters
 aditya
 The password aditya is a weak password
*/
/*
 Enter a password; a strong password should contain letters, numbers, and special characters
 aditya101221
 The password aditya101221 is a strong password
*/
/*
 Enter a password; a strong password should contain letters, numbers, and special characters
 $$$aditya00000012
 The password $$$aditya00000012 is a very strong password
*/
/*
 Enter a password; a strong password should contain letters, numbers, and special characters
 adityaaaaaaaaaaa
 The password adityaaaaaaaaaaa is an unacceptable password.
*/