/*
Aditya Tikhe
Period 7
Lab 4
*/
import java.util.Scanner;
public class SentenceInfo
{
   private String str;
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.println("Enter a string to see its Info:");
      String str = console.nextLine();
      System.out.println("Length of sentence: " +str.length()); 
      int numWords = getNumberOfWords(str);
      System.out.println("Number of Words: " +numWords);
      System.out.println("Average word length: " +getAverageWordLength(str));
   }
   public static int getNumberOfWords(String str)
   {
      int wordCounter = 0;
      int index;
      while (str.length() != 0 && str.indexOf(" ")!=-1)
      {
         index = str.indexOf(" ");
         
         String word = str.substring(0,index);
         wordCounter ++;
         str = str.substring (index+1);
      }
      wordCounter +=1;
      return wordCounter;
   }
   public static double getAverageWordLength(String str)
   { 
      int wordCounter = 0;
      int index;
      int sumLength = 0;
      String word = "";
      while (str.length() != 0 && str.indexOf(" ")!=-1)
      {
         index = str.indexOf(" ");
         word = str.substring(0,index);
         sumLength += word.length();
         wordCounter ++;
         str = str.substring (index+1);
      }
      wordCounter +=1;
      sumLength += str.length();
      double avgWorLength = (double)sumLength/(double)wordCounter;
      return avgWorLength;
   }
}
/*
 Enter a string to see its Info:
 lau is the best teacher
 Length of sentence: 23
 Number of Words: 5
 Average word length: 3.8
*/
/*
 Enter a string to see its Info:
 aditya will do good on his comp sci quiz
 Length of sentence: 40
 Number of Words: 9
 Average word length: 3.5555555555555554
*/

