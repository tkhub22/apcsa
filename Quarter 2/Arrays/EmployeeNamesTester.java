import java.util.Scanner;
public class EmployeeNamesTester
{
   public static void main (String [] args)
   {
      String [] formattedNames = new String [10];
      //String [] lastName = new String[] {"Tikhe", "Smith", "Billy", "Tommy", "Norman", "Griffin", "Jackson", "Cousins", "Wall", "Kerrigan"};
      // ^ is for without the extra credit
      
      String [] lastName = new String [10];
      Scanner console = new Scanner(System.in);
      
      for(int i = 0; i < 10; i++)
      {
         System.out.println("Enter the employee last name: ");
         lastName [i] = console.nextLine ();
      }
      formattedNames = EmployeeNames.convertName(lastName);
      for(int k = 0; k < formattedNames.length; k++)
      {
         System.out.println(formattedNames[k]);
      }
   }  
}
/*
//without extra cred
 E. H. Tikhe
 H. T. Smith
 Y. L. Billy
 Y. M. Tommy
 N. A. Norman
 N. I. Griffin
 N. O. Jackson
 S. N. Cousins
 L. L. Wall
 N. A. Kerrigan
*/
/*
//with the extra credit
 Y. E. Kelley
 D. E. Reed
 S. N. Cravens
 N. O. Garcon
 N. O. Compton
 O. C. McCo
 S. I. Davis
 S. S. Moss
 T. N. Grant
 L. I. Vigil
*/