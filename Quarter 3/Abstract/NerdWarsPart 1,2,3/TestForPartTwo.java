public class TestForPartTwo
{
   public static void main (String [] args)
   {
      Warrior [] fighters = new Warrior [5];
      
      fighters[0] = new Freak ("Peter", 'F');
      fighters[1] = new Jock ("Thomas", 'J');
      fighters[2] = new Nerd ("Dean", 'N');
      fighters[3] = new Prep ("Aditya", 'P');
      fighters[4] = new Thug ("Josh", 'T');
      
      
      Warrior item1 = fighters[(int)Math.random()*5];
      Warrior item2 = fighters[(int)Math.random()*5];
      
      item1.fight(item2);           
   }
}