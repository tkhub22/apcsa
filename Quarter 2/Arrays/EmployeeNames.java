public class EmployeeNames
{      
   static String[] convertName(String [] lastName)
   {
      String [] formattedNames = new String [10];
      
      for(int k = 0; k < lastName.length; k++)
      {
      
         String ln = lastName[k];
         String lastChar = ln.substring(ln.length()-1);
         String secondLastChar = ln.substring(ln.length()-2,ln.length()-1);
         String finalName = lastChar.toUpperCase() + ". "+ secondLastChar.toUpperCase() + ". " + ln;
         
         formattedNames[k] = finalName;
      }
      return formattedNames;
   }  
} 
