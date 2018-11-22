/*
Aditya Tikhe
Period 7
Lab 1
*/
public class EMail
{
   private String myUserName;
   private String myHostName;
   private String myExtension;
   
   public EMail (String address)
   {
      int indexOfAt = address.indexOf("@");
      int indexOfDot = address.indexOf(".");
      this.myUserName = address.substring(0,indexOfAt);
      this.myHostName = address.substring(indexOfAt+1,indexOfDot);
      this.myExtension = address.substring(indexOfDot+1);
   }
   
   public String getUserName()
   {
      return myUserName;
   }
   public String getHostName()
   {
      return myHostName;
   }
   public String getExtension()
   {
      return myExtension;
   }
   
   public String toString ()
   {
      return getUserName()+"@"+getHostName()+"."+getExtension();
   }
}