public class Jock extends Warrior
{
   public Jock (String name, char socialClique)
   {
      super(name, socialClique);
      
   }
   public void generateStats()
   {
      iq = calcRandom(80,140);
      strength = calcRandom(50,100);
   }
}