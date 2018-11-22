public class EMailTest
{
   public static void main (String [] args)
   {
      EMail email = new EMail("aditya@gmail.com");
      email.getUserName();
      System.out.println(email.getUserName());

      email.getHostName();
      System.out.println(email.getHostName());

      email.getExtension();
      System.out.println(email.getExtension());

      System.out.println(email);
   }
}
/*
 aditya
 gmail
 com
 aditya@gmail.com
*/