public class TestForPartThree
{
   public static void main (String [] args)
   {
      ArrayList <Warrior> list = new ArrayList <Warrior> ();
      
      Warrior Peter = new Warrior ("Peter", 'F');
      Warrior Thomas = new Warrior ("Thomas", 'J');
      Warrior Dean = new Warrior ("Dean", 'N');
      Warrior Aditya = new Warrior ("Aditya", 'P');
      Warrior Josh = new Warrior ("Josh", 'T');
      
      list.add(Peter);
      list.add(Thomas);
      list.add(Dean);
      list.add(Aditya);
      list.add(Josh);
   }
   
   public Warrior fight (ArrayList list)
   {
       for (int i = 0; i < list.size(); i++)
      {
         if(fight(list.get(i), list.get(i+1)))
         {
            list.remove(i);
            i=-1; 
         }
      }
      return list.get(0);
   }
}